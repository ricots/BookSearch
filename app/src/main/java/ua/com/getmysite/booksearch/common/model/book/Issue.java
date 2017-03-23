package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Issue {

    @SerializedName("issueDisplayNumber")
    private String issueDisplayNumber;

    public String getIssueDisplayNumber() {
        return issueDisplayNumber;
    }
}