package com.pulishivani.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button myButton;
    int num = 1;
    TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.myButton);
        responseText = findViewById(R.id.textView);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //System.out.print("Button Clicked");
                //num=Integer.parseInt(responseText.getText().toString())+1;
                responseText.setText("" + ++num);
                Log.i("test", "" + responseText.getText());

            }
        });
        /*responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                }

            }
        });*/
    }
}
