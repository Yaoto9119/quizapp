package com.example.quizapp;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity implements View.OnClickListener {
    TextView tv1;
    Button btnReset;
    Button btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_7);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tv1 = (TextView) findViewById(R.id.textView1);
        btnReset = (Button) findViewById(R.id.buttonReset);
        btnEnd = (Button) findViewById(R.id.btnEnd); // Initialize btnEnd

        tv1.setText(TheScore.score + "/5");

        btnReset.setOnClickListener(this); // Set the onClickListener for btnReset
        btnEnd.setOnClickListener(this); // Set the onClickListener for btnEnd
    }

    @Override
    public void onClick(View v) {
        if (v == btnReset) {
            TheScore.score = 0; // Reset the score
            Intent intent = new Intent(Activity7.this, Activity2.class);
            startActivity(intent);
            finish(); // Close the current activity
        } else if (v == btnEnd) {
            finishAffinity();
            System.exit(0);
        }
    }
}