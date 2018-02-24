package com.example.gracevictoria.atlhack2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("Greetings!", "Welcome to our app!");
        Log.w("Yo","This is Winston");
        Log.w("Yo","Its el heffe");
        Log.w("ryan", "this  is me");
        Log.w("It's your gurl ", "Grace!");
    }

    public void timePicker(View v) {
        TimePicker timePicker = findViewById(R.id.timePicker);

    }

}
