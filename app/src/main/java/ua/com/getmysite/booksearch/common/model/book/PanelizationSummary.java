package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class PanelizationSummary implements Parcelable {

    @SerializedName("containsEpubBubbles")
    private boolean containsEpubBubbles;

    @SerializedName("containsImageBubbles")
    private boolean containsImageBubbles;

    @SerializedName("imageBubbleVersion")
    private String imageBubbleVersion;

    protected PanelizationSummary(Parcel in) {
        containsEpubBubbles = in.readByte() != 0;
        containsImageBubbles = in.readByte() != 0;
        imageBubbleVersion = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (containsEpubBubbles ? 1 : 0));
        dest.writeByte((byte) (containsImageBubbles ? 1 : 0));
        dest.writeString(imageBubbleVersion);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PanelizationSummary> CREATOR = new Creator<PanelizationSummary>() {
        @Override
        public PanelizationSummary createFromParcel(Parcel in) {
            return new PanelizationSummary(in);
        }

        @Override
        public PanelizationSummary[] newArray(int size) {
            return new PanelizationSummary[size];
        }
    };

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