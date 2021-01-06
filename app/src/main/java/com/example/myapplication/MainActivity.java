package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
    Cam Tran
    Pre-work for codepath.org
    January 5,2021
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can tap a button to change the text color of the label.
        findViewById(R.id.colorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text color of the label
                ((TextView) findViewById(R.id.nameColorChange)).setTextColor(getResources().getColor(R.color.white));
            }
        });


    }
}