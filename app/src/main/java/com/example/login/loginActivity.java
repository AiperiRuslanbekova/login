package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.login.R.color.gray;

public class loginActivity extends AppCompatActivity {

    EditText email, password;
    Button  btn;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.btn);

        if (email.getText() ==null && password.getText() ==null) {
            btn.setBackgroundColor(R.color.gray);
        } else {
            btn.setBackgroundColor(R.color.orange);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(loginActivity.this,"Welcome", Toast.LENGTH_SHORT).show();
            }
        });
    }
}