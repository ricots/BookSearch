package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.SerializedName;

public class BookItem {

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