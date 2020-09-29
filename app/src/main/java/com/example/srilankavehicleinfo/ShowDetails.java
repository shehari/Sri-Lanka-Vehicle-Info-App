package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowDetails extends AppCompatActivity {

    private Button view1;
    private Button view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        view1 = (Button)findViewById(R.id.web1);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewOne();
            }
        });

        view2 = (Button)findViewById(R.id.web2);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebViewTwo();
            }
        });
    }

    public void openWebViewOne(){
        Intent viewOne = new Intent(this,InfoViewOne.class);
        startActivity(viewOne);
    }

    public void openWebViewTwo(){
        Intent viewTwo = new Intent(this, InfoViewTwo.class);
        startActivity(viewTwo);
    }
}