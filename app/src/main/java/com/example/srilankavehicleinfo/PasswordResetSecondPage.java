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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class PasswordResetSecondPage extends AppCompatActivity {
    private Button pwToLogin;
    private EditText newPW, cnfrmNewPW;
    private ImageView PWeye, cnfrmPWeye;

    private static final Pattern password_Pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$");

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_password_reset_second);

        pwToLogin = (Button) findViewById(R.id.btn_lpwToLogin);
        newPW = (EditText) findViewById(R.id.new_pw);
        cnfrmNewPW = (EditText) findViewById(R.id.cnfrm_new_pw);
        PWeye = (ImageView) findViewById(R.id.PWeye);
        cnfrmPWeye = (ImageView) findViewById(R.id.cnfrmPWeye);

        pwToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String PasswordInput = newPW.getText().toString().trim();
                String CnfrmPasswordInput = cnfrmNewPW.getText().toString().trim();

                if (PasswordInput.isEmpty()) {
                    newPW.setError("Field Can't be Empty");
                } else if (!password_Pattern.matcher(PasswordInput).matches()) {
                    newPW.setError("Password is too Week");
                } else if (CnfrmPasswordInput.isEmpty()) {
                    cnfrmNewPW.setError("Field Can't be Empty");
                } else if (!PasswordInput.equals(CnfrmPasswordInput)) {
                    cnfrmNewPW.setError("Password is not matched");
                } else {
                    openLogin();
                }

            }
        });

        PWeye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (PWeye.getTag() != null && PWeye.getTag().toString().equals("eye")) {
                    PWeye.setImageResource(R.drawable.hide_eye);
                    PWeye.setTag("hide_eye");
                    newPW.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else if (PWeye.getTag() != null && PWeye.getTag().toString().equals("hide_eye")) {
                    PWeye.setImageResource(R.drawable.eye);
                    PWeye.setTag("eye");
                    newPW.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });

        cnfrmPWeye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnfrmPWeye.getTag() != null && cnfrmPWeye.getTag().toString().equals("eye")) {
                    cnfrmPWeye.setImageResource(R.drawable.hide_eye);
                    cnfrmPWeye.setTag("hide_eye");
                    cnfrmNewPW.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else if (cnfrmPWeye.getTag() != null && cnfrmPWeye.getTag().toString().equals("hide_eye")) {
                    cnfrmPWeye.setImageResource(R.drawable.eye);
                    cnfrmPWeye.setTag("eye");
                    cnfrmNewPW.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });

    }

    public void openLogin() {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }
}
