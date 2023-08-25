package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {


    TextView edName , edPhone;
    Button back;

    Intent getIntent;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        edName = findViewById(R.id.editTextName);
        edPhone = findViewById(R.id.editTextPhone);
        back = findViewById(R.id.button_back);
        getIntent=getIntent();

        edName.setText(getIntent.getStringExtra("Key_Name"));
        edPhone.setText(getIntent.getStringExtra("Key_Phone"));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}