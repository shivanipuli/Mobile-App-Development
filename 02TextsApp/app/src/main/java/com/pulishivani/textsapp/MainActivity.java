package com.pulishivani.textsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText editText;
    TextView textView;
    TextView textView2;
    Button nextButton;
    int index;
    String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        nextButton=findViewById(R.id.next);
        textView2=findViewById(R.id.textView2);
        array=getResources().getStringArray(R.array.array);
        index=0;
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index>=array.length){
                    index=0;
                }
                textView2.setText(array[index]);
                Log.i("Joke", "Index " + index+ ": "+ array[index]);
                index++;
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
                Log.i("Copy","Success");
            }
        });
    }
}
