package com.altimedia.automotive.kt.service.podcast.network;

import com.altimedia.automotive.kt.service.podcast.model.EpisodeList;
import com.altimedia.automotive.kt.service.podcast.model.PodList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface PodcastApiService {

    public static final String BASE_URL = "https://egw.gbox.kt.com/gw/podcast/";

    @Headers("Content-Type: application/json")
    @GET("recommend")
    Call<PodList> getRecommendPodList(@Query("count") int count);

    @Headers("Content-Type: application/json")
    @GET("channellist")
    Call<PodList> getRankingPodList(@Query("count") int count, @Query("type") String type);

    @Headers("Content-Type: application/json")
    @GET("subscription")
    Call<PodList> getSubscriptionList(@Query("pid") String pid);

    @Headers("Content-Type: application/json")
    @GET("channellist")
    Call<PodList> getSearchResult(@Query("count") int count, @Query("type") String type, @Query("keyword") String keyword);

    @Headers("Content-Type: application/json")
    @GET("episodelist")
    Call<EpisodeList> getEpisodeList(@Query("count") int count, @Query("pid") String pid, @Query("sort") String sort);
}
