package com.example.student.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    TextView userText;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        userText = findViewById(R.id.userText);
        String user = getIntent().getStringExtra("usernameKey");
        user += " " + getIntent().getStringExtra("passKey");
        userText.setText(user);
        btnBack = findViewById(R.id.back_btn);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_btn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;

        }
    }
}
