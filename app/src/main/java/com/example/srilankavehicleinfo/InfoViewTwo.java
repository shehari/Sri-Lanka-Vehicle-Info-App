package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InfoViewTwo extends AppCompatActivity {

    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_view_two);

        webView2 = (WebView) findViewById(R.id.web2);
        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView2.setWebViewClient(new Callback());
        webView2.loadUrl("https://motortraffic.gov.lk/");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}