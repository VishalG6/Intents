package com.example.vishal.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_apple);
    }

    public void onClick(View view){
        Intent i = new Intent(this, bananas.class);

        final EditText appleInput = (EditText)findViewById(R.id.appleInput);
        String userMessage = appleInput.getText().toString();
        i.putExtra("appleMessage",userMessage);

        startActivity(i);
    }
}
