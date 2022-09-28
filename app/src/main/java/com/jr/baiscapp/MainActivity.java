package com.jr.baiscapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Stack(View view) {
        Intent intent = new Intent(MainActivity.this , Webpage.class);
        startActivity(intent);

    }

    public void Geek(View view) {
        Intent intent = new Intent(MainActivity.this , Webpage2.class);
        startActivity(intent);
    }
//
    public void Mit(View view) {
        Intent intent = new Intent(MainActivity.this , Webpage3.class);
        startActivity(intent);
    }
}
