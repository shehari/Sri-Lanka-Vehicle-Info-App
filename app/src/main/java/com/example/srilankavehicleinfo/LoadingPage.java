package com.example.srilankavehicleinfo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingPage extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView textView_appName, textView_appName2, textView_appName3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_loading_page);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hooks
        logo = findViewById(R.id.imgLogo);
        textView_appName = findViewById(R.id.textView_appName);
        textView_appName2 = findViewById(R.id.textView_appName2);
        textView_appName3 = findViewById(R.id.textView_appName3);

        logo.setAnimation(topAnim);
        textView_appName.setAnimation(bottomAnim);
        textView_appName2.setAnimation(bottomAnim);
        textView_appName3.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LoadingPage.this, LoginPage.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);

    }
}
