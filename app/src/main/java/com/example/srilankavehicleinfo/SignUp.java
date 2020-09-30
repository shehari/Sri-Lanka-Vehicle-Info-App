package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    private TextView signInNav;
    private EditText name, email, phoneNo, password, cnfrmPW;
    private Button register;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signup_page);

        signInNav = (TextView) findViewById(R.id.txt_signInNav);
        name = (EditText) findViewById(R.id.user_name);
        email = (EditText) findViewById(R.id.email);
        phoneNo = (EditText) findViewById(R.id.tel_no);
        password = (EditText) findViewById(R.id.pw);
        cnfrmPW = (EditText) findViewById(R.id.cnfrm_pw);
        register = (Button) findViewById(R.id.btn_signup);

        signInNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignIn();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(name.getText().toString())) {
                    Toast.makeText(SignUp.this, "User Name cannot be Empty..", Toast.LENGTH_SHORT).show();
                    //name.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_baseline_person_24, R.drawable.error, R.drawable.error, R.drawable.error);
                }

                else if (TextUtils.isEmpty(email.getText().toString())) {
                    Toast.makeText(SignUp.this, "Email cannot be Empty..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(phoneNo.getText().toString())) {
                    Toast.makeText(SignUp.this, "Phone Number cannot be Empty..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(SignUp.this, "Password cannot be Empty..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(cnfrmPW.getText().toString())) {
                    Toast.makeText(SignUp.this, "Password should be confirmed..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(cnfrmPW.getText().toString()) == TextUtils.isEmpty(phoneNo.getText().toString())) {
                    Toast.makeText(SignUp.this, "Password should be as same as the previous one..", Toast.LENGTH_SHORT).show();
                }

                else {
                    openSignIn();
                }
            }
        });
    }

    public void openSignIn(){
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

}
