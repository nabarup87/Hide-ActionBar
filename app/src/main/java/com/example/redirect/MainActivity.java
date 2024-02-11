package com.example.redirect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ndButton = findViewById(R.id.nd);
        // set on clickListener for the button
        ndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a Intent to start the Second Activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                //start The Second Activity
                startActivity(intent);
            }
        });
    }
}