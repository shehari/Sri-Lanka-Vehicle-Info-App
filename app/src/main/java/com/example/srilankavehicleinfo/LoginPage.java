package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class LoginPage extends AppCompatActivity {
    private TextView signUpNav;
    private Button login;
    private TextView pwReset;
    private EditText userName, password;
    private ImageView PWeye;

    private static final Pattern password_Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$");

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_page);

        userName = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.pw);
        signUpNav = (TextView) findViewById(R.id.txt_navSignUp);
        pwReset = (TextView) findViewById(R.id.txt_navPW);
        login = (Button) findViewById(R.id.btn_login);
        PWeye = (ImageView) findViewById(R.id.PW_eye);

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

                String NameInput = userName.getText().toString().trim();
                String PasswordInput = password.getText().toString().trim();

                if (NameInput.isEmpty()) {
                    userName.setError("Field Can't be Empty");
                } else if (PasswordInput.isEmpty()) {
                    password.setError("Field Can't be Empty");
                } else if (!password_Pattern.matcher(PasswordInput).matches()) {
                    password.setError("Password is too Week");
                } else {
                    openMain();
                }
            }
        });

        PWeye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (PWeye.getTag() != null && PWeye.getTag().toString().equals("eye")) {
                    PWeye.setImageResource(R.drawable.hide_eye);
                    PWeye.setTag("hide_eye");
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else if (PWeye.getTag() != null && PWeye.getTag().toString().equals("hide_eye")) {
                    PWeye.setImageResource(R.drawable.eye);
                    PWeye.setTag("eye");
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });

    }

    public void openSignUp() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openPWReset() {
        Intent intent = new Intent(this, PasswordResetMainPage.class);
        startActivity(intent);
    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
