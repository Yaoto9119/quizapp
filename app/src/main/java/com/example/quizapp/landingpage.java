package com.example.quizapp;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quizapp.Activity2;
import com.example.quizapp.R;

public class landingpage extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_landingpage);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        btn1=(findViewById(R.id.take));
        btn1.setOnClickListener(this);
        btn2=(findViewById(R.id.exit));
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btn1){
            Intent in=new Intent(landingpage.this, Activity2.class);
            startActivity(in);
        }
        if (v == btn2) {
            finishAffinity();
            System.exit(0);
        }
    }


}