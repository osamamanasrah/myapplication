package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editPasswd;

    private String correctName="Osama";
    private String correctPassword="pass";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.edtName);
        editPasswd = findViewById(R.id.edtPassword);
    }

    public void btnSubmitOnClick(View view) {
        String name = editName.getText().toString();
        String password = editPasswd.getText().toString();

        if(name.compareTo(correctName) == 0 && password.compareTo(correctPassword)==0){

            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }
    }
}