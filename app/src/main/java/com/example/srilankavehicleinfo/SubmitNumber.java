package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SubmitNumber extends AppCompatActivity {

    private Button submitNumber;
    EditText numberview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_number);

        submitNumber = (Button) findViewById(R.id.submitVNumber);
        numberview = (EditText) findViewById(R.id.enternumber);
        submitNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = numberview.getText().toString().trim();

                if (number.isEmpty()) {
                    numberview.setError("Field Can't be Empty");
                } else {
                    openShowDetailsPage();
                }
            }
        });

    }

    public void openShowDetailsPage() {
        Intent showdetails = new Intent(this, ShowDetails.class);
        startActivity(showdetails);
    }
}