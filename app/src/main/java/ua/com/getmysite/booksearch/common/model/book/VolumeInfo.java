package ua.com.getmysite.booksearch.common.model.book;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class VolumeInfo {

    @SerializedName("title")
    private String title;

    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("authors")
    private List<String> authors = null;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("publishedDate")
    private String publishedDate;

    @SerializedName("description")
    private String description;

    @SerializedName("readingModes")
    private ReadingModes readingModes;

    @SerializedName("pageCount")
    private long pageCount;

    @SerializedName("printType")
    private String printType;

    @SerializedName("categories")
    private List<String> categories = null;

    @SerializedName("maturityRating")
    private String maturityRating;

    @SerializedName("allowAnonLogging")
    private boolean allowAnonLogging;

    @SerializedName("contentVersion")
    private String contentVersion;

    @SerializedName("panelizationSummary")
    private PanelizationSummary panelizationSummary;

    @SerializedName("imageLinks")
    private ImageLinks imageLinks;

    @SerializedName("language")
    private String language;

    @SerializedName("previewLink")
    private String previewLink;

    @SerializedName("infoLink")
    private String infoLink;

    @SerializedName("canonicalVolumeLink")
    private String canonicalVolumeLink;

    @SerializedName("seriesInfo")
    private SeriesInfo seriesInfo;

    @SerializedName("industryIdentifiers")
    private List<IndustryIdentifier> industryIdentifiers = null;

    @SerializedName("averageRating")
    private long averageRating;

    @SerializedName("ratingsCount")
    private long ratingsCount;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public ReadingModes getReadingModes() {
        return readingModes;
    }

    public long getPageCount() {
        return pageCount;
    }

    public String getPrintType() {
        return printType;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public boolean isAllowAnonLogging() {
        return allowAnonLogging;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public PanelizationSummary getPanelizationSummary() {
        return panelizationSummary;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public String getLanguage() {
        return language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    public SeriesInfo getSeriesInfo() {
        return seriesInfo;
    }

    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    public long getAverageRating() {
        return averageRating;
    }

    public long getRatingsCount() {
        return ratingsCount;
    }

}