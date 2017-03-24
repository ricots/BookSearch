package ua.com.getmysite.booksearch.features;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ua.com.getmysite.booksearch.R;
import ua.com.getmysite.booksearch.common.model.book.BookItem;
import ua.com.getmysite.booksearch.common.model.book.Books;
import ua.com.getmysite.booksearch.common.network.client.RestClient;
import ua.com.getmysite.booksearch.common.network.services.BookService;
import ua.com.getmysite.booksearch.features.gui.adapters.IOnItemClickListener;
import ua.com.getmysite.booksearch.features.gui.adapters.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout errorRelativeLayout;
    private TextView errorTextView;
    private SwipeRefreshLayout swipeContainer;
    private StaggeredGridLayoutManager sGridLayoutManager;
    private BookService bookService;
    private Call<Books> call;

    private List<BookItem> bookList = new ArrayList<BookItem>();
    private RecyclerViewAdapter rcAdapter;

    private String nameAuthor = "";
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        errorRelativeLayout = (RelativeLayout) findViewById(R.id.errorRelativeLayout);
        errorTextView = (TextView) findViewById(R.id.errorTextView);

        addSwipeListener();
        recyclerViewInit();
        initRetrofitService();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                swipeContainer.setRefreshing(true);
                nameAuthor = query;
                rcAdapter.clear();
                getBooks(query,0);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    IOnItemClickListener onItemClickListener = new IOnItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {
            String msg = "";
            if (bookList.get(position).getVolumeInfo().getAuthors() != null)
                msg = bookList.get(position).getVolumeInfo().getAuthors().toString();
            msg += bookList.get(position).getVolumeInfo().getTitle();
            Toast.makeText(getApplicationContext(),
                    msg,
                    Toast.LENGTH_SHORT).show();
        }
    };

    private void addSwipeListener(){
        swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swipeContainer);
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                searchView.setQuery(nameAuthor,false);
                rcAdapter.clear();
                getBooks(nameAuthor,0);
            }
        });
        // Configure the refreshing colors
        swipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
    }

    private void recyclerViewInit(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvItems);
        recyclerView.setHasFixedSize(true);

        sGridLayoutManager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(sGridLayoutManager);

        rcAdapter = new RecyclerViewAdapter(bookList,
                MainActivity.this,
                onItemClickListener
                );

        recyclerView.setAdapter(rcAdapter);
        //recyclerView.setItemAnimator(new SlideInUpAnimator());
    }

    private void initRetrofitService(){
        bookService = RestClient.makeService(BookService.class);
    }

    private void getBooks(String nameAuthor, int startWith){
        call = bookService.getBooks(nameAuthor,
                startWith);
        call.enqueue(booksCallback);
    }

    private void addBooks(List<BookItem> books){
        rcAdapter.addAll(books);
    }

    Callback<Books> booksCallback = new Callback<Books>(){
        @Override
        public void onResponse(Call<Books> call, Response<Books> response) {

            if (!response.isSuccessful()) {
                int responseCode = response.code();
                if(responseCode == 504) {
                    errorTextView.setText(getString(R.string.error_load));
                    errorRelativeLayout.setVisibility(View.VISIBLE);
                }
                return;
            }

            if (response.body() != null &&
                    response.body().getBookItems() != null
                    && response.body().getBookItems().size()>0) {

                addBooks(response.body().getBookItems());
            }
            swipeContainer.setRefreshing(false);
        }

        @Override
        public void onFailure(Call<Books> call, Throwable t) {
            if (!call.isCanceled()){
                swipeContainer.setRefreshing(false);

                if(t instanceof ConnectException || t instanceof UnknownHostException){
                    errorTextView.setText(getText(R.string.error_load));
                    errorRelativeLayout.setVisibility(View.VISIBLE);
                }
            }
        }
    };
}
