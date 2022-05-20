package com.altimedia.automotive.kt.service.podcast.model;

public class PodList {
    private int status;
    private Pod[] data;
    private int count;
    private int totalCount;
    private String nextUrl;
    private boolean isEnd;

    public int getStatus() {
        return status;
    }

    public Pod[] getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public String getNextUrl() {
        return nextUrl;
    }

    public boolean isEnd() {
        return isEnd;
    }
}
