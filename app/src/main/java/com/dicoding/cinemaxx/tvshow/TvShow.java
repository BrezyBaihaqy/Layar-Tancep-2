package com.dicoding.cinemaxx.tvshow;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {
    private String tvshowphoto;
    private String tvshowname;
    private String tvshowdescription;
    private String tvshowgenre;
    private String tvshowartist;

    public String getTvshowphoto() {
        return tvshowphoto;
    }

    public void setTvshowphoto(String tvshowphoto) {
        this.tvshowphoto = tvshowphoto;
    }

    public String getTvshowname() {
        return tvshowname;
    }

    public void setTvshowname(String tvshowname) {
        this.tvshowname = tvshowname;
    }

    public String getTvshowdescription() {
        return tvshowdescription;
    }

    public void setTvshowdescription(String tvshowdescription) {
        this.tvshowdescription = tvshowdescription;
    }

    public String getTvshowgenre() {
        return tvshowgenre;
    }

    public void setTvshowgenre(String tvshowgenre) {
        this.tvshowgenre = tvshowgenre;
    }

    public String getTvshowartist() {
        return tvshowartist;
    }

    public void setTvshowartist(String tvshowartist) {
        this.tvshowartist = tvshowartist;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tvshowphoto);
        dest.writeString(this.tvshowname);
        dest.writeString(this.tvshowdescription);
        dest.writeString(this.tvshowgenre);
        dest.writeString(this.tvshowartist);
    }

    public TvShow() {
    }

    protected TvShow(Parcel in) {
        this.tvshowphoto = in.readString();
        this.tvshowname = in.readString();
        this.tvshowdescription = in.readString();
        this.tvshowgenre = in.readString();
        this.tvshowartist = in.readString();
    }

    public static final Parcelable.Creator<TvShow> CREATOR = new Parcelable.Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel source) {
            return new TvShow(source);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };
}
