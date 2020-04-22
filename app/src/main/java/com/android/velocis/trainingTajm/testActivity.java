package com.android.velocis.trainingTajm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class testActivity extends AppCompatActivity {
public TextView counterView;
public int counterText;

private final String FILE_NAME = "Bruh";
fileHandler FH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        counterView = findViewById(R.id.counterView);
        counterText= 0;

        FH = new fileHandler();
        //counterView.setText(FH.load(FILE_NAME));

    }


    public void decreaseValue (View v){
      /*  counterText -=1;
        counterView.setText(String.valueOf(counterText));*/
        counterView.setText(FH.load(FILE_NAME));

    }


    public void increaseValue (View v){
        counterText +=1;
        counterView.setText(String.valueOf(counterText));
        FH.save(FILE_NAME, String.valueOf(counterText));

    }

}
