package com.example.myjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        TextView jokeTextView = (TextView) findViewById(R.id.joke);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
