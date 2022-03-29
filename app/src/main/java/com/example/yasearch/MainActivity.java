package com.example.yasearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameInput = findViewById(R.id.input_text);
        Button activityButton = findViewById(R.id.button);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameInput.getText().toString().trim().length()==0){
                    nameInput.setError("Enter name");
                } else {
                    DataHandler.setName(nameInput.getText().toString().trim());
                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    MainActivity.this.startActivity(myIntent);
                }
            }
        });
    }
}