package com.example.quizapp;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity implements View.OnClickListener {

    RadioGroup rg1;
    Button btn1;
    RadioButton rdoans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        rg1 = findViewById(R.id.radioGroup1);
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int selectedId = rg1.getCheckedRadioButtonId();
        if (selectedId == -1) {
            // No radio button is selected
            Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
            return;
        }
        rdoans = (RadioButton) findViewById(selectedId);
        if (rdoans.getText().toString().equals("Earth")) {
            TheScore.addScore();
        }
        Intent in = new Intent(Activity5.this, Activity6.class);
        startActivity(in);
        finish();
    }
}