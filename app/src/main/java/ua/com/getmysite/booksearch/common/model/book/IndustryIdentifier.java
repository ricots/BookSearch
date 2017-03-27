package ua.com.getmysite.booksearch.common.model.book;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndustryIdentifier implements Parcelable {

    @SerializedName("type")
    private String type;

    @SerializedName("identifier")
    private String identifier;

    protected IndustryIdentifier(Parcel in) {
        type = in.readString();
        identifier = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(type);
        dest.writeString(identifier);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<IndustryIdentifier> CREATOR = new Creator<IndustryIdentifier>() {
        @Override
        public IndustryIdentifier createFromParcel(Parcel in) {
            return new IndustryIdentifier(in);
        }

        @Override
        public IndustryIdentifier[] newArray(int size) {
            return new IndustryIdentifier[size];
        }
    };

    public String getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }
}