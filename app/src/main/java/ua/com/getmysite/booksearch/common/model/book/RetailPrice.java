package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailPrice implements Parcelable {

    @SerializedName("amount")
    private double amount;

    @SerializedName("currencyCode")
    private String currencyCode;

    protected RetailPrice(Parcel in) {
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

    public static final Creator<RetailPrice> CREATOR = new Creator<RetailPrice>() {
        @Override
        public RetailPrice createFromParcel(Parcel in) {
            return new RetailPrice(in);
        }

        @Override
        public RetailPrice[] newArray(int size) {
            return new RetailPrice[size];
        }
    };

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}