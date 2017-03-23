package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListPrice_ {

    @SerializedName("amountInMicros")
    private long amountInMicros;

    @SerializedName("currencyCode")
    private String currencyCode;

    public long getAmountInMicros() {
        return amountInMicros;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}