package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Offer implements Parcelable {

    @SerializedName("finskyOfferType")
    private long finskyOfferType;

    @SerializedName("listPrice")
    private ListPrice_ listPrice;

    @SerializedName("retailPrice")
    private RetailPrice_ retailPrice;

    protected Offer(Parcel in) {
        finskyOfferType = in.readLong();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(finskyOfferType);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Offer> CREATOR = new Creator<Offer>() {
        @Override
        public Offer createFromParcel(Parcel in) {
            return new Offer(in);
        }

        @Override
        public Offer[] newArray(int size) {
            return new Offer[size];
        }
    };

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