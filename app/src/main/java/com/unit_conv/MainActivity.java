package com.unit_conv;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button convertButton;
    Button clearButton;
    EditText convertValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        convertButton = findViewById(R.id.convertButton);
        clearButton = findViewById(R.id.clearButton);
        convertValue = findViewById(R.id.convertValue);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = convertValue.getText().toString();
                Log.d("MainActivity", "Value: " + value);
                Intent myIntent = new Intent(MainActivity.this, ResultActivity.class);
                myIntent.putExtra("VALUE", value);
                startActivity(myIntent);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertValue.setText("0");
            }
        });
    }
}