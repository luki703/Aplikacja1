package com.example.aplikacja1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
    }
    public void onbuttonClick(View view)
    {
        String name = editName.getText().toString();
        Toast.makeText(this, "Witaj" + name, Toast.LENGTH_LONG).show();
    }
}