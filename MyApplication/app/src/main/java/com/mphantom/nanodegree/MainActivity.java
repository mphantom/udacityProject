package com.mphantom.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View v) {
        showToast("this button will launch SPOTIFY STREAMER");
    }

    public void button2(View v) {
        showToast("this button will launch SCORES APP");
    }

    public void button3(View v) {
        showToast("this button will launch LIBRAY APP");
    }

    public void button4(View v) {
        showToast("this button will launch BUILD IT BIGGER");
    }

    public void button5(View v) {
        showToast("this button will launch XYZ READER");
    }

    public void button6(View v) {
        showToast("this button will launch my capstone app");
    }

    private void showToast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}
