package com.android.velocis.trainingTajm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button pushup;
    private Button pullup;
    private Button dip;
    private Button squat;
    private Button plank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushup = (Button) findViewById(R.id.pushup);
        pullup = (Button) findViewById(R.id.pullup);
        dip = (Button) findViewById(R.id.dip);
        squat = (Button) findViewById(R.id.squat);
        plank = (Button) findViewById(R.id.plank);

    }

    public void enterPushupPage(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void enterPullupPage(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void enterDipPage(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void enterSquatPage(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void enterPlankPage(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}