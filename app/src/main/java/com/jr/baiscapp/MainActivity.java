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
        Intent i = new Intent(MainActivity.this,Webpage.class);
        i.putExtra("website", "https://stackoverflow.com/");
        startActivity(i);

    }

    public void Geek(View view) {
//        Intent intent = new Intent(MainActivity.this , Webpage2.class);
//        startActivity(intent);
        Intent i = new Intent(MainActivity.this,Webpage.class);
        i.putExtra("website", "https://www.geeksforgeeks.org/");
        startActivity(i);
    }
//
    public void Mit(View view) {
//        Intent intent = new Intent(MainActivity.this , Webpage3.class);
//        startActivity(intent);

        Intent i = new Intent(MainActivity.this,Webpage.class);
        i.putExtra("website", "https://ocw.mit.edu/");
        startActivity(i);

    }
}
