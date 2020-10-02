package com.example.android.e_booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void student_login(View view){
        Intent intent = new Intent(MainActivity.this, StudentActivity.class);
        startActivity(intent);
    }

    public void librarian_login(View view){
        Intent intent = new Intent(MainActivity.this, LibrarianActivity.class);
        startActivity(intent);
    }
}