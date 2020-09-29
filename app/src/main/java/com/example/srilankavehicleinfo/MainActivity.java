package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button alertHome;
    private Button vehicleSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertHome = (Button) findViewById(R.id.alertHome);
        alertHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRevenueAlertNav();
            }
        });


        vehicleSubmit = (Button)findViewById(R.id.detail);
        vehicleSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVehicleSubmitNumberPage();
            }
        });

    }

    public void openRevenueAlertNav(){
        Intent intent = new Intent(this, AlertNavigation.class);
        startActivity(intent);
    }

    public void openVehicleSubmitNumberPage(){
        Intent submitNumber = new Intent(this,SubmitNumber.class);
        startActivity(submitNumber);
    }

}