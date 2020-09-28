package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InfoViewOne extends AppCompatActivity {

    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view_one);

        webView1 =  (WebView)findViewById(R.id.web1);
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new Callback());
        webView1.loadUrl("https://www.gov.lk/welcome.html");
    }

    class Callback extends WebViewClient{
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event){
            return false;
        }
    }
}