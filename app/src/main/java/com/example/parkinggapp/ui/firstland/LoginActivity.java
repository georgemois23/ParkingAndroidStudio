package com.example.parkinggapp.ui.firstland;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parkinggapp.MainActivity;
import com.example.parkinggapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText adminUsername, adminPassword;
    private Button continueAsUser, connectAsAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        adminUsername = findViewById(R.id.adminUsername);
        adminPassword = findViewById(R.id.adminPassword);
        continueAsUser = findViewById(R.id.continueAsUser);
        connectAsAdmin = findViewById(R.id.connectAsAdmin);

//        adminUsername.setVisibility(View.GONE);
//        adminPassword.setVisibility(View.GONE);

        continueAsUser.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });

        connectAsAdmin.setOnClickListener(v -> {
            // If the fields are hidden, show them, else validate credentials
            if (adminUsername.getVisibility() == View.GONE) {
                adminUsername.setVisibility(View.VISIBLE);
                adminPassword.setVisibility(View.VISIBLE);
            } else {
                // Only access the text when the fields are visible
                String username = "";
                String password = "";

                if (adminUsername.getVisibility() == View.VISIBLE) {
                    username = adminUsername.getText().toString().trim();
                }
                if (adminPassword.getVisibility() == View.VISIBLE) {
                    password = adminPassword.getText().toString().trim();
                }

                // Check if the credentials are valid
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please fill in both fields", Toast.LENGTH_SHORT).show();
                } else if (username.equals("admin") && password.equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}