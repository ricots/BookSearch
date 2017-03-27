package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pdf implements Parcelable {

    @SerializedName("isAvailable")
    private boolean isAvailable;

    @SerializedName("acsTokenLink")
    private String acsTokenLink;

    protected Pdf(Parcel in) {
        isAvailable = in.readByte() != 0;
        acsTokenLink = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isAvailable ? 1 : 0));
        dest.writeString(acsTokenLink);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Pdf> CREATOR = new Creator<Pdf>() {
        @Override
        public Pdf createFromParcel(Parcel in) {
            return new Pdf(in);
        }

        @Override
        public Pdf[] newArray(int size) {
            return new Pdf[size];
        }
    };

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }
}