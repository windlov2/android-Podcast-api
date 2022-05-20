package com.altimedia.automotive.kt.service.podcast;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.altimedia.automotive.kt.service.podcast.databinding.ActivityMainBinding;
import com.altimedia.automotive.kt.service.podcast.network.TestRequest;

import java.util.List;
import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {

    private TestRequest testRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        testRequest = new TestRequest();

        binding.btnRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRecommendList();
            }
        });

        binding.btnRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRankingList();
            }
        });

        binding.btnSubscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSubscriptionList();
            }
        });

        binding.btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSearchResult();
            }
        });

        binding.btnEpisodeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEpisodeList();
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchOtherApp("com.android.car.slidinglayoutexam");
            }
        });
    }

    private void getEpisodeList() {
        testRequest.getEpisodeList(30, "3866", "desc");
    }

    private void getSubscriptionList() {
        testRequest.getSubscriptionList(new String[]{"7290", "16898", "12548"});
    }

    private void getRankingList() {
        testRequest.getRankingList(30, "ranking");
    }

    private void getRecommendList() {
        testRequest.getRecommendList(10);
    }

    private void getSearchResult() {
        testRequest.getSearchResult(10, "search", "정치");
    }

    private boolean existPackage(String packageName) {
        try {
            getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void launchOtherApp(String packageName) {
//        Intent intent = new Intent();
//        intent.setComponent(new ComponentName("com.android.car.slidinglayoutexam", "com.android.car.slidinglayoutexam.receiver.RadioReceiver"));
//        intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//        intent.setAction("radio.play");
//        sendBroadcast(intent);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // 설치된 패키지 정보를 그냥은 획득할 수 없고 Manifest 에 등록해야 함
        }
        if (existPackage(packageName)) {
            Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            // playstore 이동
            String url = "market://details?id=" + "com.example.testapp";
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(i);
        }
    }
}