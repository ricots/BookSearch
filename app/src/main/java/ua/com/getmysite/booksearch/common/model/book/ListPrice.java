package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListPrice implements Parcelable {

    @SerializedName("amount")
    private double amount;

    @SerializedName("currencyCode")
    private String currencyCode;

    protected ListPrice(Parcel in) {
        amount = in.readDouble();
        currencyCode = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(amount);
        dest.writeString(currencyCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ListPrice> CREATOR = new Creator<ListPrice>() {
        @Override
        public ListPrice createFromParcel(Parcel in) {
            return new ListPrice(in);
        }

        @Override
        public ListPrice[] newArray(int size) {
            return new ListPrice[size];
        }
    };

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}