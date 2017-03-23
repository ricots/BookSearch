package ua.com.getmysite.booksearch;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by anymol on 23.03.2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
