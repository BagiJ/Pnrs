package com.example.student.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;    //definisemo promenljivu button
    EditText username;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("create", "OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);     //pozovemo btnLogin = findVeiwById(R.id.btnLogin)
        username = findViewById(R.id.username);
        userpass = findViewById(R.id.userpass);
        btnLogin.setOnClickListener(this);          //btnLoing.setOnClickListener(this  +  alt+enter)
    }

    @Override
    protected void onStart() {
        Log.d("start", "OnStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("stop", "OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("destroy", "OnDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("pause", "OnPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("resume", "OnResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("restart", "OnRestart");
        super.onRestart();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                Intent intent = new Intent(this, HomePage.class);
                intent.putExtra("usernameKey", username.getText().toString());
                intent.putExtra("passKey", userpass.getText().toString());
                startActivity(intent);
                finish();
                break;
        }
    }
}

