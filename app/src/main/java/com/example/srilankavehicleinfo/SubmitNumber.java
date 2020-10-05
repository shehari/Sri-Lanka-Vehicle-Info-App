package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubmitNumber extends AppCompatActivity {

    private Button submitNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_number);

        submitNumber = (Button)findViewById(R.id.submitVNumber);
        submitNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(submitNumber.getText().toString()))
                {
                    Toast.makeText(SubmitNumber.this,"Please Enter Vehicle Number", Toast.LENGTH_SHORT);
                }

                else {
                    openShowDetailsPage();
                }
            }
        });

    }

    public void openShowDetailsPage(){
        Intent showdetails = new Intent(this,ShowDetails.class);
        startActivity(showdetails);
    }
}