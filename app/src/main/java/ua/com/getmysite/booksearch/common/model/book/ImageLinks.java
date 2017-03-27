package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageLinks implements Parcelable {

    @SerializedName("smallThumbnail")
    private String smallThumbnail;

    @SerializedName("thumbnail")
    private String thumbnail;

    protected ImageLinks(Parcel in) {
        smallThumbnail = in.readString();
        thumbnail = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(smallThumbnail);
        dest.writeString(thumbnail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ImageLinks> CREATOR = new Creator<ImageLinks>() {
        @Override
        public ImageLinks createFromParcel(Parcel in) {
            return new ImageLinks(in);
        }

        @Override
        public ImageLinks[] newArray(int size) {
            return new ImageLinks[size];
        }
    };

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}