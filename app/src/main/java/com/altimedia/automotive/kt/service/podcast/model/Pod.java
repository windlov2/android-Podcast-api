package com.altimedia.automotive.kt.service.podcast.model;

import com.google.gson.annotations.SerializedName;

public class Pod {
    private String pid;
    private String title;
    private String imageUrl;
    @SerializedName("psubtitle")
    private String pSubTitle;
    private String category;
    private String fileUrl;
    private String eid;
    @SerializedName("etitle")
    private String eTitle;
    private String pubDate;
    @SerializedName("etime")
    private String eTime;

    public String getPid() {
        return pid;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getpSubTitle() {
        return pSubTitle;
    }

    public String getCategory() {
        return category;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public String getEid() {
        return eid;
    }

    public String geteTitle() {
        return eTitle;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String geteTime() {
        return eTime;
    }
}
