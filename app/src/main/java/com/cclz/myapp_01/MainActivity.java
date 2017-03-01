package com.cclz.myapp_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

// test
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LEARN", "onCreate()");
    }

    public void Click1(View v){
        Intent it=new Intent(MainActivity.this, Main2Activity.class);
        startActivity(it);
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
