package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PasswordResetSecondPage extends AppCompatActivity {
    private Button pwToLogin;
    private EditText newPW, cnfrmNewPW;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_password_reset_second);

        pwToLogin = (Button) findViewById(R.id.btn_lpwToLogin);
        newPW = (EditText) findViewById(R.id.new_pw);
        cnfrmNewPW = (EditText) findViewById(R. id.cnfrm_new_pw);

        pwToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(newPW.getText().toString())) {
                    Toast.makeText(PasswordResetSecondPage.this, "Password cannot be Empty..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(cnfrmNewPW.getText().toString())) {
                    Toast.makeText(PasswordResetSecondPage.this, "Password should be confirmed..", Toast.LENGTH_SHORT).show();
                }

                else if (TextUtils.isEmpty(cnfrmNewPW.getText().toString()) == TextUtils.isEmpty(newPW.getText().toString())) {
                    Toast.makeText(PasswordResetSecondPage.this, "Password should be as same as the previous one..", Toast.LENGTH_SHORT).show();
                }

                else {
                    openLogin();
                }

            }
        });
    }

    public void openLogin(){
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
