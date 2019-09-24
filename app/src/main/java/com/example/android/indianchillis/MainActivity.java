 package com.example.android.indianchillis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

 public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webview);
        WebSettings WebSettings = webView.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://indianchillis.000webhostapp.com/index.html");
        webView.setWebViewClient(new WebViewClient());


    }
}
