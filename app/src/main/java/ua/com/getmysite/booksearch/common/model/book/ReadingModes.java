package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadingModes {

    @SerializedName("text")
    private boolean text;

    @SerializedName("image")
    private boolean image;

    public boolean isText() {
        return text;
    }

    public boolean isImage() {
        return image;
    }
}