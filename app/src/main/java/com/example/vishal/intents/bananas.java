package com.example.vishal.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class bananas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_bananas);

        Bundle appleData = getIntent().getExtras();
        if(appleData==null) {
            return;
        }
        String appleMessage = appleData.getString("appleMessage");
        final TextView userText = (TextView)findViewById(R.id.userText);
        userText.setText(appleMessage);
    }

    public void onClick(View view){
        Intent i = new Intent(this, apple.class);



        startActivity(i);
    }
}
