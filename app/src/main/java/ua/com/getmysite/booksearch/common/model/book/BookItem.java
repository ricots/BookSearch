package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class BookItem implements Parcelable {

    @SerializedName("kind")
    private String kind;

    @SerializedName("id")
    private String id;

    @SerializedName("etag")
    private String etag;

    @SerializedName("selfLink")
    private String selfLink;

    @SerializedName("volumeInfo")
    private VolumeInfo volumeInfo;

    @SerializedName("saleInfo")
    private SaleInfo saleInfo;

    @SerializedName("accessInfo")
    private AccessInfo accessInfo;

    @SerializedName("searchInfo")
    private SearchInfo searchInfo;


    protected BookItem(Parcel in) {
        kind = in.readString();
        id = in.readString();
        etag = in.readString();
        selfLink = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(kind);
        dest.writeString(id);
        dest.writeString(etag);
        dest.writeString(selfLink);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<BookItem> CREATOR = new Creator<BookItem>() {
        @Override
        public BookItem createFromParcel(Parcel in) {
            return new BookItem(in);
        }

        @Override
        public BookItem[] newArray(int size) {
            return new BookItem[size];
        }
    };

    public String getKind() {
        return kind;
    }

    public String getId() {
        return id;
    }

    public String getEtag() {
        return etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }
}