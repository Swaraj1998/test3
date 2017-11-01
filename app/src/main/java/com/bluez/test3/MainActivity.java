package com.bluez.test3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY = "com.bluez.test3.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        String value = message.getText().toString();
        Intent intent = new Intent(this, NewActivity.class);
        intent.putExtra(MESSAGE_KEY, value);
        startActivity(intent);
    }
}
