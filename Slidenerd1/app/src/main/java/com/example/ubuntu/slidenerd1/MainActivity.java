package com.example.ubuntu.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("VIVZ","onCreate was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("VIVZ","onResume was called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("VIVZ","onStart was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("VIVZ","onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("VIVZ","onStop was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VIVZ","onDestroy was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("VIVZ","onRestart was called");
    }


}
