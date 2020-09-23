package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LicenseAlertMainPage extends AppCompatActivity {
    private Button HomeSubsBtn;
    private Button HomeUnsubsBtn;
    private Button Profile;
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

        Profile = (Button) findViewById(R.id.Profile);
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLicenseAlertProfilePage();
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

    public void openLicenseAlertProfilePage() {
        Intent intent2 = new Intent(this, AlertProfilePage.class);
        startActivity(intent2);
    }


}

