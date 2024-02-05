package com.route.coursesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.imv_android || v.getId() == R.id.btn_android) {
            startCourseDetails(getString(R.string.android));
            return;
        }
        if (v.getId() == R.id.imv_ios || v.getId() == R.id.btn_ios) {
            startCourseDetails(getString(R.string.ios));
            return;
        }
        if (v.getId() == R.id.imv_fullstack || v.getId() == R.id.btn_fullstack)
            startCourseDetails(getString(R.string.fullstack));
    }

    public void startCourseDetails(String courseName) {
        Intent intent = new Intent(this, CourseDetails.class);
        intent.putExtra(getString(R.string.course), courseName);
        startActivity(intent);
    }
}