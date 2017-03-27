package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadingModes implements Parcelable {

    @SerializedName("text")
    private boolean text;

    @SerializedName("image")
    private boolean image;

    protected ReadingModes(Parcel in) {
        text = in.readByte() != 0;
        image = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (text ? 1 : 0));
        dest.writeByte((byte) (image ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ReadingModes> CREATOR = new Creator<ReadingModes>() {
        @Override
        public ReadingModes createFromParcel(Parcel in) {
            return new ReadingModes(in);
        }

        @Override
        public ReadingModes[] newArray(int size) {
            return new ReadingModes[size];
        }
    };

    public boolean isText() {
        return text;
    }

    public boolean isImage() {
        return image;
    }
}