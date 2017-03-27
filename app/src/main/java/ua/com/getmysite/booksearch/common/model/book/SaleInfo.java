package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SaleInfo implements Parcelable {

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

    protected SaleInfo(Parcel in) {
        country = in.readString();
        saleability = in.readString();
        isEbook = in.readByte() != 0;
        buyLink = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(country);
        dest.writeString(saleability);
        dest.writeByte((byte) (isEbook ? 1 : 0));
        dest.writeString(buyLink);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SaleInfo> CREATOR = new Creator<SaleInfo>() {
        @Override
        public SaleInfo createFromParcel(Parcel in) {
            return new SaleInfo(in);
        }

        @Override
        public SaleInfo[] newArray(int size) {
            return new SaleInfo[size];
        }
    };

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