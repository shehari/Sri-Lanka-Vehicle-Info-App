package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LicenseAlertMainPage extends AppCompatActivity {
    private Button HomeSubsBtn;
    private Button HomeUnsubsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_alert_main_page);

        HomeSubsBtn = (Button) findViewById(R.id.HomeSubsBtn);
        HomeSubsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLicenseAlertsubsPage();
            }
        });
                HomeUnsubsBtn = (Button) findViewById(R.id.HomeUnsubsBtn);
                HomeUnsubsBtn.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               openLicenseAlertUnsubsPage();
                                           }
                                       }
        );
    }

    public void openLicenseAlertsubsPage() {
        Intent intent = new Intent(this, AlertSubsPage.class);
        startActivity(intent);
    }

    public void openLicenseAlertUnsubsPage() {
        Intent intent1 = new Intent(this, AlertUnsubsPage.class);
        startActivity(intent1);
    }


}

