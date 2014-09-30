package com.app.customnumpad;

import android.app.Activity;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.view.KeyEvent;


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

        final EditText edittext = (EditText) findViewById(R.id.editText1);
        /*edittext.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.v("KeyPressed: ", String.valueOf(keyCode));
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    String textValue = edittext.getText().toString();
                    Log.v("EditTextValue: ", textValue);
                }
                return true;
            }
    }); */
}
}