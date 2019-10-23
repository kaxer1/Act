package com.example.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class navegador extends AppCompatActivity {

    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);
        webView1 = (WebView) findViewById(R.id.webView);

        Bundle bundle = getIntent().getExtras();
        webView1.loadUrl("http://"+bundle.getString("url"));
    }





}
