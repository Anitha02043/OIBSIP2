package com.unit_conv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView resultText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_res); // Corrected layout file name

        resultText = findViewById(R.id.resultText);
        backButton = findViewById(R.id.backButton); // Initialize backButton

        String value = getIntent().getStringExtra("VALUE");
        double fahrenheit = (Integer.parseInt(value) * 1.8) + 32; // Corrected parentheses
        resultText.setText(Double.toString(fahrenheit)); // Corrected parentheses

        if (backButton != null) { // Check for null before setting OnClickListener
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }
}