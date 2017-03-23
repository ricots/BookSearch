package ua.com.getmysite.booksearch.common.model.book;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Books {

    @SerializedName("kind")
    private String kind;

    @SerializedName("totalItems")
    private long totalItems;

    @SerializedName("items")
    private List<Item> items = null;

    public String getKind() {
        return kind;
    }

    public long getTotalItems() {
        return totalItems;
    }

    public List<Item> getItems() {
        return items;
    }
}