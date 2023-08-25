package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etName , edPhone ;
    Button button;

    Intent nextActivity;

    String name , phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.name_edtxt);
        edPhone = findViewById(R.id.phone_edtxt);
        button =findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Hiiiii proo", Toast.LENGTH_LONG).show();
                nextActivity=new Intent(MainActivity.this, SecondActivity2.class);
                name=etName.getText() .toString();
                phone = edPhone.getText().toString();


                nextActivity.putExtra("Key_Name",name);
                nextActivity.putExtra("Key_Phone",phone);

                if (name!=null)
                     startActivity(nextActivity);


            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",name);
        outState.putString("phone",phone);
    }
}