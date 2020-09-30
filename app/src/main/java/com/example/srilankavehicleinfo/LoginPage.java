package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    private TextView signUpNav;
    private Button login;
    private TextView pwReset;
    private EditText userName, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_page);

        userName = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.pw);
        signUpNav = (TextView) findViewById(R.id.txt_navSignUp);
        pwReset = (TextView) findViewById(R.id.txt_navPW);
        login = (Button) findViewById(R.id.btn_login);

        signUpNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
        pwReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPWReset();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(userName.getText().toString())) {
                    Toast.makeText(LoginPage.this, "User Name cannot be Empty..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(LoginPage.this, "Password cannot be Empty..", Toast.LENGTH_SHORT).show();
                }

                else {
                    openMain();
                }
            }
        });
    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openPWReset(){
        Intent intent = new Intent(this, PasswordResetMainPage.class);
        startActivity(intent);
    }

    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
