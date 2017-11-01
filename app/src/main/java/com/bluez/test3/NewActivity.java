package com.bluez.test3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    public final static String MESSAGE_KEY = "com.bluez.test3.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        TextView outputText = (TextView) findViewById(R.id.output_text);
        String value = getIntent().getStringExtra(MESSAGE_KEY);
        outputText.setText(value);
    }
}
