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
    }

    public void openPWResetSecond(){
        Intent intent = new Intent(this, PasswordResetSecondPage.class);
        startActivity(intent);
    }
}
