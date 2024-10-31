package com.example.placementactivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultText = findViewById(R.id.resultText);

        // Get Data from Intent
        String name = getIntent().getStringExtra("name");
        boolean isPlaced = getIntent().getBooleanExtra("isPlaced", false);
        float rating = getIntent().getFloatExtra("rating", 0.0f);

        // Display the User Inputs
        String result = "Name: " + name + "\nPlaced: " + (isPlaced ? "Yes" : "No") + "\nRating: " + rating;
        resultText.setText(result);
    }
}

