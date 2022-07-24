package com.shivani.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int[] layouts = {R.layout.activity_main,R.layout.activity_6, R.layout.activity_2, R.layout.activity_3, R.layout.activity_4,R.layout.activity_7,R.layout.activity_1};
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layouts[count]);
    }

    public void next(View view) {
        setContentView(layouts[count]);
        count++;
        if(count>=layouts.length){
            count=0;
        }

        Log.i("next", "count=" + count);
    }
}
