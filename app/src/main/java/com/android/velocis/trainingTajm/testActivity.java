package com.android.velocis.trainingTajm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class testActivity extends AppCompatActivity {
public TextView counterView;
public int counterText;
private final String FILE_NAME = "bruh";
fileHandler FH = new fileHandler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        counterView = findViewById(R.id.counterView);
        counterText= 0;
    }

    public void decreaseValue (View v){
        counterText -=1;
        counterView.setText(String.valueOf(counterText));
        FH.save(counterView, FILE_NAME, counterText);
    }


    public void increaseValue (View v){
        counterText +=1;
        counterView.setText(String.valueOf(counterText));
    }

}
