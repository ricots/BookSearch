package ua.com.getmysite.booksearch.features;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import ua.com.getmysite.booksearch.R;

public class MainActivity extends AppCompatActivity {

    //Start
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
