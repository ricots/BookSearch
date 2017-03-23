package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.SerializedName;

public class AccessInfo {

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
