package com.candicelouw.plaquesdeparisno2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Originally created and designed by CLouw on 30/05/2020.
 */

public class MainActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.myWebView);
        myWebView.loadUrl("file:///android_asset/plaquesdeparisno2.html");
    }
}
