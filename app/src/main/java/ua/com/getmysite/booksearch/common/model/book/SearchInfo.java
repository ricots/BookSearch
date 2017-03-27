package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchInfo implements Parcelable {

    @SerializedName("textSnippet")
    private String textSnippet;

    protected SearchInfo(Parcel in) {
        textSnippet = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(textSnippet);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SearchInfo> CREATOR = new Creator<SearchInfo>() {
        @Override
        public SearchInfo createFromParcel(Parcel in) {
            return new SearchInfo(in);
        }

        @Override
        public SearchInfo[] newArray(int size) {
            return new SearchInfo[size];
        }
    };

    public String getTextSnippet() {
        return textSnippet;
    }
}