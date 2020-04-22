package com.android.velocis.trainingTajm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button pushup;
    private Button plank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushup = (Button) findViewById(R.id.pushup);

    }

    public void enterPushupPage(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
