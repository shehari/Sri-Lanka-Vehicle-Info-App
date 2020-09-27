package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertNavigation extends AppCompatActivity {
    private Button revenueAlertNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_navigation);

        revenueAlertNav = (Button) findViewById(R.id.revenueAlertNav);
        revenueAlertNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrevenueAlertNav();
            }
        });
    }
    public void openrevenueAlertNav(){
        Intent intent = new Intent(this, LicenseAlertMainPage.class);
        startActivity(intent);
    }
}