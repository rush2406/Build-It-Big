package com.example.jokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView joke = (TextView)findViewById(R.id.joketext);
        String value = getIntent().getStringExtra("joke");
        joke.setText(value);
    }
}
