package ua.com.getmysite.booksearch.common.network.client;

/**
 * Created by anymo on 16.12.2016.
 */

public class Config {

    private Config(){
        throw new AssertionError();
    }

    static final String VERSION = "5.60";
    static final String BASE_URL = "https://www.googleapis.com/books/v1/";
}
