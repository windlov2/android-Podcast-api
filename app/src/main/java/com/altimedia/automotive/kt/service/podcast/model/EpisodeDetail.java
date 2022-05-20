package com.altimedia.automotive.kt.service.podcast.model;

import com.google.gson.annotations.SerializedName;

public class EpisodeDetail {
    private int status;
    private Detail[] data;

    class Detail {
        private String pid;
        private String title;
        private String eid;
        @SerializedName("etitle")
        private String eTitle;
        private String fileUrl;
        private String pubDate;
        @SerializedName("etime")
        private String eTime;

        public String getPid() {
            return pid;
        }

        public String getTitle() {
            return title;
        }

        public String getEid() {
            return eid;
        }

        public String geteTitle() {
            return eTitle;
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
    }

    public int getStatus() {
        return status;
    }

    public Detail[] getData() {
        return data;
    }
}
