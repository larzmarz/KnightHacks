package com.example.knighthacks;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ImageView logo = findViewById(R.id.iv_logo);

        final ObjectAnimator rotation = ObjectAnimator.ofFloat(logo, "rotation", 0f, 360f);
        rotation.setDuration(3000);
        rotation.setInterpolator(new LinearInterpolator());
        rotation.setRepeatCount(ObjectAnimator.INFINITE);
        rotation.start();
    }
}
