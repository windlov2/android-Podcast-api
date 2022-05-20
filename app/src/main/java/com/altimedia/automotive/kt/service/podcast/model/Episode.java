package com.altimedia.automotive.kt.service.podcast.model;

import com.google.gson.annotations.SerializedName;

public class Episode {
    private String eid;
    @SerializedName("etitle")
    private String eTitle;
    private String imageUrl;
    private String fileUrl;
    private String pubDate;
    @SerializedName("etime")
    private String eTime;
    private String title;
    @SerializedName("psubtitle")
    private String pSubTitle;

    public String getEid() {
        return eid;
    }

    public String geteTitle() {
        return eTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String geteTime() {
        return eTime;
    }

    public String getTitle() {
        return title;
    }

    public String getpSubTitle() {
        return pSubTitle;
    }
}
