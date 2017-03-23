package ua.com.getmysite.booksearch.common.model.book;

import com.google.gson.annotations.SerializedName;

public class PanelizationSummary {

    @SerializedName("containsEpubBubbles")
    private boolean containsEpubBubbles;

    @SerializedName("containsImageBubbles")
    private boolean containsImageBubbles;

    @SerializedName("imageBubbleVersion")
    private String imageBubbleVersion;

    public boolean isContainsEpubBubbles() {
        return containsEpubBubbles;
    }

    public boolean isContainsImageBubbles() {
        return containsImageBubbles;
    }

    public String getImageBubbleVersion() {
        return imageBubbleVersion;
    }
}