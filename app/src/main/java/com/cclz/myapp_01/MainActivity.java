package com.cclz.myapp_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LEARN", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LEARN", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LEARN", "onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LEARN", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LEARN", "onDestroy()");
    }
}
