package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    private TextView signInNav;
    private EditText name, email, phoneNo, password, cnfrmPW;
    private Button register;
    private ImageView cnfrmPWEye, PWEye;

    private static final Pattern password_Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$");

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signup_page);

        signInNav = (TextView) findViewById(R.id.txt_signInNav);
        name = (EditText) findViewById(R.id.user_name);
        email = (EditText) findViewById(R.id.email);
        phoneNo = (EditText) findViewById(R.id.tel_no);
        password = (EditText) findViewById(R.id.pw);
        cnfrmPW = (EditText) findViewById(R.id.cnfrm_pw);
        register = (Button) findViewById(R.id.btn_signup);
        cnfrmPWEye = (ImageView) findViewById(R.id.cnfrmPW_eye);
        PWEye = (ImageView) findViewById(R.id.PW_eye);

        signInNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NameInput = name.getText().toString().trim();
                String EmailInput = email.getText().toString().trim();
                String ConatactInput = phoneNo.getText().toString().trim();
                String PasswordInput = password.getText().toString().trim();
                String CnfrmPasswordInput = cnfrmPW.getText().toString().trim();

                if (NameInput.isEmpty()) {
                    name.setError("Field Can't be Empty");
                } else if (EmailInput.isEmpty()) {
                    email.setError("Field Can't be Empty");
                } else if (!Patterns.EMAIL_ADDRESS.matcher(EmailInput).matches()) {
                    email.setError("Please Enter a valid Email");
                } else if (ConatactInput.isEmpty()) {
                    phoneNo.setError("Field Can't be Empty");
                } else if (ConatactInput.length() != 10) {
                    phoneNo.setError("Please Enter a Valid Contact Number");
                } else if (PasswordInput.isEmpty()) {
                    password.setError("Field Can't be Empty");
                } else if (!password_Pattern.matcher(PasswordInput).matches()) {
                    password.setError("Password is too Week");
                } else if (CnfrmPasswordInput.isEmpty()) {
                    cnfrmPW.setError("Field Can't be Empty");
                } else if (!PasswordInput.equals(CnfrmPasswordInput)) {
                    cnfrmPW.setError("Password is not matched");
                } else {
                    openSignIn();
                }

            }
        });

        PWEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (PWEye.getTag() != null && PWEye.getTag().toString().equals("eye")) {
                    PWEye.setImageResource(R.drawable.hide_eye);
                    PWEye.setTag("hide_eye");
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else if (PWEye.getTag() != null && PWEye.getTag().toString().equals("hide_eye")) {
                    PWEye.setImageResource(R.drawable.eye);
                    PWEye.setTag("eye");
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });

        cnfrmPWEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnfrmPWEye.getTag() != null && cnfrmPWEye.getTag().toString().equals("eye")) {
                    cnfrmPWEye.setImageResource(R.drawable.hide_eye);
                    cnfrmPWEye.setTag("hide_eye");
                    cnfrmPW.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else if (cnfrmPWEye.getTag() != null && cnfrmPWEye.getTag().toString().equals("hide_eye")) {
                    cnfrmPWEye.setImageResource(R.drawable.eye);
                    cnfrmPWEye.setTag("eye");
                    cnfrmPW.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });
    }

    public void openSignIn() {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

}
