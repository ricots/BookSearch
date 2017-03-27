package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Epub implements Parcelable {

    @SerializedName("isAvailable")
    @Expose
    private boolean isAvailable;
    @SerializedName("acsTokenLink")
    @Expose
    private String acsTokenLink;

    protected Epub(Parcel in) {
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

    public static final Creator<Epub> CREATOR = new Creator<Epub>() {
        @Override
        public Epub createFromParcel(Parcel in) {
            return new Epub(in);
        }

        @Override
        public Epub[] newArray(int size) {
            return new Epub[size];
        }
    };

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }
}