package com.example.tester;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAGG"," MODIFYING MOAR CODE");
        Log.i("TAG"," MOAR CODE AFTER THE NEW CHECKOUT YEAHH!!!!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        Log.i("CREATING"," MENUS ");
        return true;
    }
    
}
