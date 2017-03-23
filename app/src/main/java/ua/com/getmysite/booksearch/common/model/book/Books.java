package ua.com.getmysite.booksearch.common.model.book;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Books {

    @SerializedName("kind")
    private String kind;

    @SerializedName("totalItems")
    private long totalItems;

    @SerializedName("items")
    private List<BookItem> bookItems = null;

    public String getKind() {
        return kind;
    }

    public long getTotalItems() {
        return totalItems;
    }

    public List<BookItem> getBookItems() {
        return bookItems;
    }
}