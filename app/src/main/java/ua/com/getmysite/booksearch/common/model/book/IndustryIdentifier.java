package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndustryIdentifier {

    @SerializedName("type")
    private String type;

    @SerializedName("identifier")
    private String identifier;

    public String getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }
}