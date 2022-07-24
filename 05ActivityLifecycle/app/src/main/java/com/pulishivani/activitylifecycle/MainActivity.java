package com.pulishivani.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    TextView onCreateF;
    TextView onStart;
    TextView onStartF;
    TextView onResume;
    TextView onResumeF;
    TextView onPause;
    TextView onPauseF;
    TextView onStop;
    TextView onStopF;
    TextView onRestart;
    TextView onRestartF;
    TextView onDestroy;
    TextView onDestroyF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCreateF=findViewById(R.id.onCreateF);
        onStart=findViewById(R.id.onStart);
        onStartF=findViewById(R.id.onStartF);
        onRestart=findViewById(R.id.onRestart);
        onRestartF=findViewById(R.id.onRestartF);
        onPause=findViewById(R.id.onPause);
        onPauseF=findViewById(R.id.onPauseF);
        onStop=findViewById(R.id.onStop);
        onStopF=findViewById(R.id.onStopF);
        onDestroy=findViewById(R.id.onDestroy);
        onDestroyF=findViewById(R.id.onDestroyF);
        onResume=findViewById(R.id.onResume);
        onResumeF=findViewById(R.id.onResumeF);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = sharedPreferences.edit();
        editor.putInt("onStart",0);
        editor.putInt("onResume",0);
        editor.putInt("onPause",0);
        editor.putInt("onStop",0);
        editor.putInt("onRestart",0);
        editor.putInt("onDestroy",0);
        editor.putInt("onCreateF",sharedPreferences.getInt("onCreateF",0)+1);
        editor.apply();

        onCreateF.setText(""+sharedPreferences.getInt("onCreateF",-1));
        onRestartF.setText(""+sharedPreferences.getInt("onRestartF",-1));
        onResumeF.setText(""+sharedPreferences.getInt("onResumeF",-1));
        onDestroyF.setText(""+sharedPreferences.getInt("onDestroyF",0));
        onPauseF.setText(""+sharedPreferences.getInt("onPauseF",-1));
        onStopF.setText(""+sharedPreferences.getInt("onStopF",-1));

    }
    @Override
    protected void onResume() {
        super.onResume();
        editor.putInt("onResume",sharedPreferences.getInt("onResume",0)+1);
        editor.putInt("onResumeF",sharedPreferences.getInt("onResumeF",0)+1);
        editor.apply();
        onResume.setText(""+sharedPreferences.getInt("onResume",-1));
        onResumeF.setText(""+sharedPreferences.getInt("onResumeF",-1));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        editor.putInt("onRestart",sharedPreferences.getInt("onRestart",0)+1);
        editor.putInt("onRestartF",sharedPreferences.getInt("onRestartF",0)+1);
        editor.apply();
        onRestart.setText(""+sharedPreferences.getInt("onRestart",-1));
        onRestartF.setText(""+sharedPreferences.getInt("onRestartF",-1));
    }

    @Override
    protected void onStart() {
        super.onStart();
        editor.putInt("onStart",sharedPreferences.getInt("onStart",0)+1);
        editor.putInt("onStartF",sharedPreferences.getInt("onStartF",0)+1);
        editor.apply();
        onStart.setText(""+sharedPreferences.getInt("onStart",-1));
        onStartF.setText(""+sharedPreferences.getInt("onStartF",-1));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        editor.putInt("onDestroy",sharedPreferences.getInt("onDestroy",0)+1);
        editor.putInt("onDestroyF",sharedPreferences.getInt("onDestroyF",0)+1);
        editor.apply();
        onDestroy.setText(""+sharedPreferences.getInt("onDestroy",-1));
        onDestroyF.setText(""+sharedPreferences.getInt("onDestroyF",-1));
    }

    @Override
    protected void onPause() {
        super.onPause();
        editor.putInt("onPause",sharedPreferences.getInt("onPause",0)+1);
        editor.putInt("onPauseF",sharedPreferences.getInt("onPauseF",0)+1);
        editor.apply();
        onPause.setText(""+sharedPreferences.getInt("onPause",-1));
        onPauseF.setText(""+sharedPreferences.getInt("onPauseF",-1));
    }

    @Override
    protected void onStop() {
        super.onStop();
        editor.putInt("onStop",sharedPreferences.getInt("onStop",0)+1);
        editor.putInt("onStopF",sharedPreferences.getInt("onStopF",0)+1);
        editor.apply();
        onStop.setText(""+sharedPreferences.getInt("onStop",-1));
        onStopF.setText(""+sharedPreferences.getInt("onStopF",-1));
    }
}
