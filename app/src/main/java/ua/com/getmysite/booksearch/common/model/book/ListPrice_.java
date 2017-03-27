package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListPrice_ implements Parcelable{

    @SerializedName("amountInMicros")
    private long amountInMicros;

    @SerializedName("currencyCode")
    private String currencyCode;

    protected ListPrice_(Parcel in) {
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

    public static final Creator<ListPrice_> CREATOR = new Creator<ListPrice_>() {
        @Override
        public ListPrice_ createFromParcel(Parcel in) {
            return new ListPrice_(in);
        }

        @Override
        public ListPrice_[] newArray(int size) {
            return new ListPrice_[size];
        }
    };

    public long getAmountInMicros() {
        return amountInMicros;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}