package com.app.customnumpad;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class CustomNumpadView extends KeyboardView {

    CustomOnKeyboardActionListener keyListener;
    Keyboard kb = null;
    public CustomNumpadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        kb = new Keyboard(context,R.xml.keyboard);
    }
    
    public void setActionListenerActivity(Activity act){
        keyListener = new CustomOnKeyboardActionListener(act);
        this.setOnKeyboardActionListener(keyListener);
        this.setKeyboard(kb);
    }
    
    @Override
    public boolean isInEditMode() {
        return true;
    };
    
    private class CustomOnKeyboardActionListener implements OnKeyboardActionListener {
        Activity owner;
        
        public CustomOnKeyboardActionListener(Activity activity){
            owner = activity;
        }
        
        @Override
        public void onKey(int primaryCode, int[] keyCodes) {
            long eventTime = System.currentTimeMillis();
            KeyEvent event = new KeyEvent(eventTime, eventTime,
                    KeyEvent.ACTION_DOWN, primaryCode, 0, 0, 0, 0,
                    KeyEvent.FLAG_SOFT_KEYBOARD | KeyEvent.FLAG_KEEP_TOUCH_MODE);
            owner.dispatchKeyEvent(event);

            if(event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {

                   //final EditText editText1 = (EditText)findViewById(R.id.editText1);

                   //String inputValue = editText1.getText().toString();

                   //String valu = event.toString();
                   Log.v("The value is ", inputValue);

                // x = KeyEvent.KEYCODE_ENTER;
                //int x = event.getKeyCode();
                //String va = String.valueOf(x);
               //Log.v("EditTextValue: ", inputValue);
            }
        }

        @Override
        public void onPress(int primaryCode) {
        }

        @Override
        public void onRelease(int primaryCode) {
        }

        @Override
        public void onText(CharSequence text) {
        }

        @Override
        public void swipeDown() {
        }

        @Override
        public void swipeLeft() {
        }

        @Override
        public void swipeRight() {
        }

        @Override
        public void swipeUp() {
        }
        
    }

}
