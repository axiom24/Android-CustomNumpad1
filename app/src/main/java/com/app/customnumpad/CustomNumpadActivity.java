package com.app.customnumpad;

import android.app.Activity;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CustomNumpadActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView textView = (TextView) findViewById(R.id.inputdata1);
        textView.setText("8327105964");

        //textView.setFreezesText();


        //Get Numpad to set current activity to dispatch key events
        CustomNumpadView cnv = (CustomNumpadView) findViewById(R.id.numpadView);
        cnv.setActionListenerActivity(this);
        System.out.println("Came here successfully");
    }
}