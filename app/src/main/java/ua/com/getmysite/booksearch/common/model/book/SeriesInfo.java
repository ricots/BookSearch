package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SeriesInfo implements Parcelable {

    @SerializedName("kind")
    private String kind;

    @SerializedName("bookDisplayNumber")
    private String bookDisplayNumber;

    @SerializedName("volumeSeries")
    private List<VolumeSeries> volumeSeries = null;

    protected SeriesInfo(Parcel in) {
        kind = in.readString();
        bookDisplayNumber = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(kind);
        dest.writeString(bookDisplayNumber);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SeriesInfo> CREATOR = new Creator<SeriesInfo>() {
        @Override
        public SeriesInfo createFromParcel(Parcel in) {
            return new SeriesInfo(in);
        }

        @Override
        public SeriesInfo[] newArray(int size) {
            return new SeriesInfo[size];
        }
    };

    public String getKind() {
        return kind;
    }

    public String getBookDisplayNumber() {
        return bookDisplayNumber;
    }

    public List<VolumeSeries> getVolumeSeries() {
        return volumeSeries;
    }
}