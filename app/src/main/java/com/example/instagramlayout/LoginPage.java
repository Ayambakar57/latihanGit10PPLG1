package com.example.instagramlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername = txtUsername.getText().toString();
                String enteredPassword = txtPassword.getText().toString();

                // Check if the entered username and password are correct
                if (enteredUsername.equals("Admin") && enteredPassword.equals("admin123")) {
                    // Successful login
                    Toast.makeText(LoginPage.this, "Login successful", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(LoginPage.this, aritmatikaKalkulator.class);

                    // Start the SecondActivity
                    startActivity(intent);
                } else {
                    // Incorrect username or password
                    Toast.makeText(LoginPage.this, "Incorrect username or password", Toast.LENGTH_LONG).show();
                }
            }
        });





    }
}