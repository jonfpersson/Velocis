package com.android.velocis.trainingTajm;

import android.content.Context;
import android.os.Debug;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static android.content.Context.MODE_PRIVATE;

public class fileHandler extends AppCompatActivity {

       public void save (String FILE_NAME, String value) {
           FileOutputStream outputStream;

           try {
               outputStream = openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
               outputStream.write(value.getBytes());
               outputStream.flush();
               outputStream.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }


    public String load(String FILE_NAME) {
        String returnText = "fail";
           try {
            FileInputStream fileInputStream = openFileInput(FILE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
               System.out.print("nisse");
            StringBuffer sb = new StringBuffer();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            returnText = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
           return returnText;
    }
}
