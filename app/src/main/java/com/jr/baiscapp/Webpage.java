package com.jr.baiscapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage);
        WebView webView = findViewById(R.id.webview1);
        webView.loadUrl("https://stackoverflow.com/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());



    }
}

//


//
//    WebView webView = findViewById(R.id.webview3);
//        webView.loadUrl("https://ocw.mit.edu/");
//                webView.getSettings().setJavaScriptEnabled(true);
//                webView.setWebViewClient(new WebViewClient());


/**
 * package com.adanawtn.FunnMagViewerWindow;
 *
 * import com.adanawtn.funnmagviewerwindow.R;
 *
 *
 * import android.app.Activity;
 *
 * import android.content.Intent;
 *
 * import android.os.Bundle;
 *
 * import android.webkit.WebView;
 *
 * public class Class1 extends Activity {
 *
 *  @Override
 *
 *     protected void onCreate(Bundle savedInstanceState) {
 *
 *     super.onCreate(savedInstanceState);
 *
 *     setContentView(R.layout.activity_class1);
 *
 *
 *  WebView webview1 = (WebView) findViewById(R.id.webView1);
 *
 *
 * Intent logoClick = getIntent();
 *     String uri = logoClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(uri);
 *
 * Intent twitClick = getIntent();
 *     String twituri = twitClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(twituri);
 *
 *
 * Intent instClick = getIntent();
 *     String insturi = instClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(insturi);
 *
 *     Intent bestClick = getIntent();
 *     String besturi = bestClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(besturi);
 *
 *     Intent gearsClick = getIntent();
 *     String gearsuri = gearsClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(gearsuri);
 *
 *  Intent artsClick = getIntent();
 *     String artsuri = artsClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(artsuri);
 *
 *     Intent travelClick = getIntent();
 *     String traveluri = travelClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(traveluri);
 *
 *  Intent eventsClick = getIntent();
 *     String eventsuri = eventsClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(eventsuri);
 *
 *  Intent dailyClick = getIntent();
 *     String dailyuri = dailyClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(dailyuri);
 *
 *  Intent magClick = getIntent();
 *     String maguri = magClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(maguri);
 *
 *     Intent tvClick = getIntent();
 *     String tvuri = tvClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(tvuri);
 *
 *
 * Intent mallClick = getIntent();
 *     String malluri = mallClick.getStringExtra("uri");
 *     setContentView(webview1);
 *     webview1.loadUrl(malluri);
 *
 *
 * }
 *
 *
 * }
 */