package com.altimedia.automotive.kt.service.podcast.model;

public class EpisodeList {
    private int status;
    private Episode[] data;
    private int count;
    private String nextUrl;
    private boolean isEnd;

    public int getStatus() {
        return status;
    }

    public Episode[] getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    public String getNextUrl() {
        return nextUrl;
    }

    public boolean isEnd() {
        return isEnd;
    }
}
