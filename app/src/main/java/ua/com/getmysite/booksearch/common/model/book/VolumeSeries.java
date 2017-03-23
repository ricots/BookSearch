package ua.com.getmysite.booksearch.common.model.book;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class VolumeSeries {

    @SerializedName("seriesId")
    private String seriesId;

    @SerializedName("seriesBookType")
    private String seriesBookType;

    @SerializedName("orderNumber")
    private long orderNumber;

    @SerializedName("issue")
    private List<Issue> issue = null;

    public String getSeriesId() {
        return seriesId;
    }

    public String getSeriesBookType() {
        return seriesBookType;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public List<Issue> getIssue() {
        return issue;
    }

}