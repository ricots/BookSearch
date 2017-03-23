package ua.com.getmysite.booksearch.common.model.book;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SeriesInfo {

    @SerializedName("kind")
    private String kind;

    @SerializedName("bookDisplayNumber")
    private String bookDisplayNumber;

    @SerializedName("volumeSeries")
    private List<VolumeSeries> volumeSeries = null;

    public String getKind() {
        return kind;
    }

    public String getBookDisplayNumber() {
        return bookDisplayNumber;
    }

    public List<VolumeSeries> getVolumeSeries() {
        return volumeSeries;
    }
}