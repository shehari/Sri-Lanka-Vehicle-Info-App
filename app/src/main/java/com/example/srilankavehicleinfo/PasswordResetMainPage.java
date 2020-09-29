package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PasswordResetMainPage extends AppCompatActivity {
    private Button pwResetSecond;
    private Button sendCode;
    private TextView code_1, code_2, code_3, code_4, resend, wait;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_password_reset_main);

        pwResetSecond = (Button) findViewById(R.id.btn_pwResetSecond);
        pwResetSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPWResetSecond();
            }
        });

        code_1 = (TextView) findViewById(R.id.code_1);
        code_2 = (TextView) findViewById(R.id.code_2);
        code_3 = (TextView) findViewById(R.id.code_3);
        code_4 = (TextView) findViewById(R.id.code_4);
        resend = (TextView) findViewById(R.id.txt_resend);
        wait = (TextView) findViewById(R.id.txt_wait);

        sendCode = (Button) findViewById(R.id.btn_sendCode);
        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pwResetSecond.setVisibility(View.VISIBLE);
                code_1.setVisibility(View.VISIBLE);
                code_2.setVisibility(View.VISIBLE);
                code_3.setVisibility(View.VISIBLE);
                code_4.setVisibility(View.VISIBLE);
                resend.setVisibility(View.VISIBLE);
                wait.setVisibility(View.VISIBLE);
                sendCode.setEnabled(false);
            }
        });
    }

    public void openPWResetSecond(){
        Intent intent = new Intent(this, PasswordResetSecondPage.class);
        startActivity(intent);
    }
}
