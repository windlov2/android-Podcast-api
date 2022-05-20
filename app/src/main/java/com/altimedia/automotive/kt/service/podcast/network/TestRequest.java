package com.altimedia.automotive.kt.service.podcast.network;

import android.util.Log;

import androidx.annotation.NonNull;

import com.altimedia.automotive.kt.service.podcast.model.EpisodeList;
import com.altimedia.automotive.kt.service.podcast.model.PodList;
import com.google.gson.Gson;

import java.util.Collections;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestRequest {

    private static final String TAG = TestRequest.class.getSimpleName();

    public void getRecommendList(int count) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PodcastApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        PodcastApiService apiService = retrofit.create(PodcastApiService.class);

        Call<PodList> getPodList = apiService.getRecommendPodList(count);
        getPodList.enqueue(new Callback<PodList>() {
            @Override
            public void onResponse(@NonNull Call<PodList> call, @NonNull Response<PodList> response) {
                PodList pods = response.body();
                if (pods != null) {
                    Log.d(TAG, "getRecommendList(), pods = " + new Gson().toJson(pods));
                }
            }

            @Override
            public void onFailure(@NonNull Call<PodList> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure(): " + t);
            }
        });
    }

    public void getRankingList(int count, @NonNull String type) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PodcastApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        PodcastApiService apiService = retrofit.create(PodcastApiService.class);

        Call<PodList> getPodList = apiService.getRankingPodList(count, type);
        getPodList.enqueue(new Callback<PodList>() {
            @Override
            public void onResponse(@NonNull Call<PodList> call, @NonNull Response<PodList> response) {
                PodList pods = response.body();
                if (pods != null) {
                    Log.d(TAG, "getRankingList(), pods = " + new Gson().toJson(pods));
                }
            }

            @Override
            public void onFailure(@NonNull Call<PodList> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure(): " + t);
            }
        });
    }

    public void getSubscriptionList(@NonNull String[] pids) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PodcastApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        PodcastApiService apiService = retrofit.create(PodcastApiService.class);

        String pid = android.text.TextUtils.join(",", pids);
        Call<PodList> getPodList = apiService.getSubscriptionList(pid);
        getPodList.enqueue(new Callback<PodList>() {
            @Override
            public void onResponse(@NonNull Call<PodList> call, @NonNull Response<PodList> response) {
                PodList pods = response.body();
                if (pods != null) {
                    Log.d(TAG, "getSubscriptionList(), pods = " + new Gson().toJson(pods));
                }
            }

            @Override
            public void onFailure(@NonNull Call<PodList> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure(): " + t);
            }
        });
    }

    public void getSubscriptionList(@NonNull String commaSeparatorParam) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PodcastApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        PodcastApiService apiService = retrofit.create(PodcastApiService.class);

        Call<PodList> getPodList = apiService.getSubscriptionList(commaSeparatorParam);
        getPodList.enqueue(new Callback<PodList>() {
            @Override
            public void onResponse(@NonNull Call<PodList> call, @NonNull Response<PodList> response) {
                PodList pods = response.body();
                if (pods != null) {
                    Log.d(TAG, "getSubscriptionList(), pods = " + new Gson().toJson(pods));
                }
            }

            @Override
            public void onFailure(@NonNull Call<PodList> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure(): " + t);
            }
        });
    }

    public void getSearchResult(int count, @NonNull String type, @NonNull String keyword) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PodcastApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        PodcastApiService apiService = retrofit.create(PodcastApiService.class);

        Call<PodList> getPodList = apiService.getSearchResult(count, type, keyword);
        getPodList.enqueue(new Callback<PodList>() {
            @Override
            public void onResponse(@NonNull Call<PodList> call, @NonNull Response<PodList> response) {
                PodList pods = response.body();
                if (pods != null) {
                    Log.d(TAG, "getSearchResult(), pods = " + new Gson().toJson(pods));
                }
            }

            @Override
            public void onFailure(@NonNull Call<PodList> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure(): " + t);
            }
        });
    }

    public void getEpisodeList(int count, @NonNull String pid, String sort) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor()).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PodcastApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        PodcastApiService apiService = retrofit.create(PodcastApiService.class);

        Call<EpisodeList> getPodList = apiService.getEpisodeList(count, pid, sort);
        getPodList.enqueue(new Callback<EpisodeList>() {
            @Override
            public void onResponse(@NonNull Call<EpisodeList> call, @NonNull Response<EpisodeList> response) {
                EpisodeList episodes = response.body();
                if (episodes != null) {
                    Log.d(TAG, "getEpisodeList(), pods = " + new Gson().toJson(episodes));
                }
            }

            @Override
            public void onFailure(@NonNull Call<EpisodeList> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure(): " + t);
            }
        });
    }

    private HttpLoggingInterceptor httpLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(@NonNull String s) {
                Log.d(TAG, s);
            }
        });

        return interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    }
}
