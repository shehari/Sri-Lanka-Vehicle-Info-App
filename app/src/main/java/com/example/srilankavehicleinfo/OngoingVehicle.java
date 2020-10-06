package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class OngoingVehicle extends AppCompatActivity{

    public CardView carcadmy;
    Dialog mydialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_vehicle);

        carcadmy = (CardView) findViewById(R.id.carcard1);
        //carcadmy.setOnClickListener(this);
        /*mydialog = new Dialog(OngoingVehicle.this);*/

        carcadmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* mydialog.setContentView(R.layout.activity_ongoing_demo_data);
                mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));*/
               showdemoDialog();
            }
        });

    }

public void showdemoDialog()
{
    Dialog mydialog = new Dialog(OngoingVehicle.this);
    mydialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    mydialog.setContentView(R.layout.activity_ongoing_demo_data);

    Button dialogbtn = mydialog.findViewById(R.id.btn_ongoing_ok);
    dialogbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goBack();
        }
    });

    mydialog.show();
}

    public void goBack()
    {
        Intent i = new Intent(this,OngoingVehicle.class);
        startActivity(i);
    }
}