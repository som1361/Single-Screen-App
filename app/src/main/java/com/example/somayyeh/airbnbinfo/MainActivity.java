package com.example.somayyeh.airbnbinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Justify description body using webView 
        String htmlText = " %s ";
        WebView webView = (WebView) findViewById(R.id.webView);
        //load prepared data in webView
        webView.loadData(getString(R.string.hello), "text/html; charset=utf-8", "utf-8");
    }
}
