package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class AccessInfo implements Parcelable {

    @SerializedName("country")
    private String country;

    @SerializedName("viewability")
    private String viewability;

    @SerializedName("embeddable")
    private boolean embeddable;

    @SerializedName("publicDomain")
    private boolean publicDomain;

    @SerializedName("textToSpeechPermission")
    private String textToSpeechPermission;

    @SerializedName("epub")
    private Epub epub;

    @SerializedName("pdf")
    private Pdf pdf;

    @SerializedName("webReaderLink")
    private String webReaderLink;

    @SerializedName("accessViewStatus")
    private String accessViewStatus;

    @SerializedName("quoteSharingAllowed")
    private boolean quoteSharingAllowed;

    protected AccessInfo(Parcel in) {
        country = in.readString();
        viewability = in.readString();
        embeddable = in.readByte() != 0;
        publicDomain = in.readByte() != 0;
        textToSpeechPermission = in.readString();
        webReaderLink = in.readString();
        accessViewStatus = in.readString();
        quoteSharingAllowed = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(country);
        dest.writeString(viewability);
        dest.writeByte((byte) (embeddable ? 1 : 0));
        dest.writeByte((byte) (publicDomain ? 1 : 0));
        dest.writeString(textToSpeechPermission);
        dest.writeString(webReaderLink);
        dest.writeString(accessViewStatus);
        dest.writeByte((byte) (quoteSharingAllowed ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AccessInfo> CREATOR = new Creator<AccessInfo>() {
        @Override
        public AccessInfo createFromParcel(Parcel in) {
            return new AccessInfo(in);
        }

        @Override
        public AccessInfo[] newArray(int size) {
            return new AccessInfo[size];
        }
    };

    public String getCountry() {
        return country;
    }

    public String getViewability() {
        return viewability;
    }

    public boolean isEmbeddable() {
        return embeddable;
    }

    public boolean isPublicDomain() {
        return publicDomain;
    }

    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    public Epub getEpub() {
        return epub;
    }

    public Pdf getPdf() {
        return pdf;
    }

    public String getWebReaderLink() {
        return webReaderLink;
    }

    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    public boolean isQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }
}
