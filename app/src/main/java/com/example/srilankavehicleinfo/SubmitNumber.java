package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.scwang.wave.MultiWaveHeader;

public class SubmitNumber extends AppCompatActivity {

    private Button submitNumber;
    MultiWaveHeader waveHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_number);

        submitNumber = (Button)findViewById(R.id.submitnumber);
        submitNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShowDetailsPage();
            }
        });

        waveHeader = findViewById(R.id.wawe_header);

        waveHeader.setVelocity(1);
        waveHeader.setProgress(1);
        waveHeader.isRunning();
        waveHeader.setGradientAngle(45);
        waveHeader.setWaveHeight(40);
        waveHeader.setStartColor(Color.RED);
        waveHeader.setCloseColor(Color.CYAN);
    }

    public void openShowDetailsPage(){
        Intent showdetails = new Intent(this,ShowDetails.class);
        startActivity(showdetails);
    }
}