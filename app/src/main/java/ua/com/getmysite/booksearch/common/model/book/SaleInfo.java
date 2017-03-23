package ua.com.getmysite.booksearch.common.model.book;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SaleInfo {

    @SerializedName("country")
    private String country;

    @SerializedName("saleability")
    private String saleability;

    @SerializedName("isEbook")
    private boolean isEbook;

    @SerializedName("listPrice")
    private ListPrice listPrice;

    @SerializedName("retailPrice")
    private RetailPrice retailPrice;

    @SerializedName("buyLink")
    private String buyLink;

    @SerializedName("offers")
    private List<Offer> offers = null;

    public String getCountry() {
        return country;
    }

    public String getSaleability() {
        return saleability;
    }

    public boolean isIsEbook() {
        return isEbook;
    }

    public ListPrice getListPrice() {
        return listPrice;
    }

    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public List<Offer> getOffers() {
        return offers;
    }
}