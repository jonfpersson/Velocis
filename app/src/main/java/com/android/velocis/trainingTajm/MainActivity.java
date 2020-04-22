package com.android.velocis.trainingTajm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
public TextView counterView;
public int counterText;
private final String FILE_NAME = "bruh";
fileHandler FH = new fileHandler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
