package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.SerializedName;

public class Offer {

    @SerializedName("finskyOfferType")
    private long finskyOfferType;

    @SerializedName("listPrice")
    private ListPrice_ listPrice;

    @SerializedName("retailPrice")
    private RetailPrice_ retailPrice;

    public long getFinskyOfferType() {
        return finskyOfferType;
    }

    public ListPrice_ getListPrice() {
        return listPrice;
    }

    public RetailPrice_ getRetailPrice() {
        return retailPrice;
    }
}