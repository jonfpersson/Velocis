package com.android.velocis.trainingTajm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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