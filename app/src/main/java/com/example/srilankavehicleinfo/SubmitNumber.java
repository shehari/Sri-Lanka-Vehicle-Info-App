package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubmitNumber extends AppCompatActivity {

    private Button submitNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_number);

        submitNumber = (Button)findViewById(R.id.submitbtn);
        submitNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShowDetailsPage();
            }
        });

    }

    public void openShowDetailsPage(){
        Intent showdetails = new Intent(this,ShowDetails.class);
        startActivity(showdetails);
    }
}