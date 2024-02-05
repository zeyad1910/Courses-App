package com.route.coursesapp;


import static com.route.coursesapp.Constants.ANDROID_CONTENT;
import static com.route.coursesapp.Constants.FULL_STACK_CONTENT;
import static com.route.coursesapp.Constants.IOS_CONTENT;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CourseDetails extends AppCompatActivity {
    ImageView courseDetailsImageView;
    TextView courseDetailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        courseDetailsImageView = findViewById(R.id.imv_course_details);
        courseDetailsTextView = findViewById(R.id.tv_course_details);
        courseDetailsTextView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        if (intent == null)
            return;
        String courseName = intent.getStringExtra(getString(R.string.course));
        changeContent(courseName);
    }

    public void changeContent(String courseName) {
        if (courseName.equals(getString(R.string.android))) {
            courseDetailsImageView.setImageResource(R.drawable.android);
            courseDetailsTextView.setText(ANDROID_CONTENT);
        } else if (courseName.equals(getString(R.string.ios))) {
            courseDetailsImageView.setImageResource(R.drawable.ios);
            courseDetailsTextView.setText(IOS_CONTENT);
        } else if (courseName.equals(getString(R.string.fullstack))) {
            courseDetailsImageView.setImageResource(R.drawable.full_stack);
            courseDetailsTextView.setText(FULL_STACK_CONTENT);
        }
    }
}