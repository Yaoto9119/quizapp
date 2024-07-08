package com.example.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_DURATION = 3100;//  4seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Use a Handler to post a delayed action for transitioning to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity after the splash screen duration
                Intent in = new Intent(MainActivity.this, landingpage.class);
                startActivity(in);
                finish();
            }
        }, SPLASH_DURATION);
    }
}