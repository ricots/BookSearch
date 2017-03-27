package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailPrice_ implements Parcelable {

    @SerializedName("amountInMicros")
    private long amountInMicros;

    @SerializedName("currencyCode")
    private String currencyCode;

    protected RetailPrice_(Parcel in) {
        amountInMicros = in.readLong();
        currencyCode = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(amountInMicros);
        dest.writeString(currencyCode);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RetailPrice_> CREATOR = new Creator<RetailPrice_>() {
        @Override
        public RetailPrice_ createFromParcel(Parcel in) {
            return new RetailPrice_(in);
        }

        @Override
        public RetailPrice_[] newArray(int size) {
            return new RetailPrice_[size];
        }
    };

    public long getAmountInMicros() {
        return amountInMicros;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}