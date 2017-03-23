package ua.com.getmysite.booksearch.common.network.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ua.com.getmysite.booksearch.common.model.book.Books;

/**
 * Created by anymol on 23.03.2017.
 */

public interface BookService {

    @GET("volumes")
    Call<Books> getBooks(
            @Query("q") String user_ids,
            @Query("startIndex") long access_token
    );
}
