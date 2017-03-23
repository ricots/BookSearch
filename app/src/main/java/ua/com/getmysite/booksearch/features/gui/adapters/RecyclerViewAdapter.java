package ua.com.getmysite.booksearch.features.gui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ua.com.getmysite.booksearch.R;
import ua.com.getmysite.booksearch.common.model.book.BookItem;

/**
 * Created by anymol on 23.03.2017.
 */

public class RecyclerViewAdapter
        extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<BookItem> bookItemList;
    private Context context;
    private RecyclerViewHolder rcv;

    private IOnItemClickListener mItemClickListener;

    public RecyclerViewAdapter(List<BookItem> bookItemList, Context context, IOnItemClickListener mItemClickListener) {
        this.bookItemList = bookItemList;
        this.context = context;
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_item, null);
        rcv = new RecyclerViewHolder(layoutView);
        rcv.setOnItemClickListener(mItemClickListener);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.sdvImage.setImageURI(bookItemList.get(position).getVolumeInfo().getImageLinks().getSmallThumbnail());
        holder.tvNameBook.setText(bookItemList.get(position).getVolumeInfo().getTitle());
    }

    @Override
    public int getItemCount() {
        return this.bookItemList.size();
    }

    // Clean all elements of the recycler
    public void clear() {
        bookItemList.clear();
        notifyDataSetChanged();
    }

    // Add a list of items
    public void addAll(List<BookItem> list) {
        bookItemList.addAll(list);
        notifyDataSetChanged();
    }
}
