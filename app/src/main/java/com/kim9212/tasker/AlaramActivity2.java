package com.kim9212.tasker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlaramActivity2 extends AppCompatActivity {
    private Intent intent;
    private final String packageNames = "kr.go.hrd.app";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alaram2);

        intent = this.getPackageManager().getLaunchIntentForPackage(packageNames);
    }

    public void clickbtninstart(View view) {
        AlaramActivity2.this.startActivity(intent);
    }
}