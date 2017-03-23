package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchInfo {

    @SerializedName("textSnippet")
    private String textSnippet;

    public String getTextSnippet() {
        return textSnippet;
    }
}