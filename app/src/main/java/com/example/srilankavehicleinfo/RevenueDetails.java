package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RevenueDetails extends AppCompatActivity {
//RevlicenceData
    private Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revenue_details);

        mybutton = (Button) findViewById(R.id.submitbtnrev);
        mybutton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //revnumbertxt

                viewData();
            }
        });

    }

    public void viewData()
    {
        Intent i = new Intent(this,RevlicenceData.class);
        startActivity(i);
    }

}