package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alertHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertHome = (Button) findViewById(R.id.alertHome);
        alertHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLicenseAlertMainPage();
            }
        });
    }
    public void openLicenseAlertMainPage(){
        Intent intent = new Intent(this, LicenseAlertMainPage.class);
        startActivity(intent);
    }
}