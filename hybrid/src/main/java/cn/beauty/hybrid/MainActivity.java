package cn.beauty.hybrid;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;

import java.util.HashMap;
import java.util.Map;

import cn.beauty.hybrid.webview.WebAppInterface;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Hybrid";
    private WebView mMyWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyWebView = findViewById(R.id.my_webview);
        String unencodedHtml =
                "&lt;html&gt;&lt;body&gt;'%23' is the percent code for ‘#‘ &lt;/body&gt;&lt;/html&gt;";
        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
                Base64.NO_PADDING);
        System.out.println(unencodedHtml);
        System.out.println(encodedHtml);
//        mMyWebView.loadData(encodedHtml, "text/html", "base64");
        handlingPageNavigation();
        usingJavaScript();
        mMyWebView.loadUrl("http://www.taobao.com");
        Map<String, Integer> map = new HashMap<>(1);
        map.put("1", 1);
        map.put("1", 2);
    }

    /**
     * Building web apps in WebView
     */
    private void usingJavaScript() {
        mMyWebView.getSettings().setJavaScriptEnabled(true);
        mMyWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
    }

    private void handlingPageNavigation() {
        mMyWebView.setWebViewClient(new MyWebviewClient());
    }

    private void navigatingWebPageHistory() {

    }

    private void handlingDeviceConfigurationChange() {

    }


    /**
     *
     * Android Call JS
     */
    private void androidCallaJs() {
        mMyWebView.evaluateJavascript("javascript:Date.now()", new ValueCallback<String>() {
            @Override
            public void onReceiveValue(String value) {

            }
        });
    }

    private void JsCallAndroid() {


    }


    /**
     * Managing WebView Objects
     */
    private void versionAPI() {

    }

    private boolean mSafeBrowsingIsInitialized;
    private void googleSafeBrowsingService() {
        /**
         * <meta-data android:name="android.webkit.WebView.EnableSafeBrowsing"
         *                    android:value="false" />
         */
        // must target android 8.1 or higher
        if (WebViewFeature.isFeatureSupported(WebViewFeature.START_SAFE_BROWSING)) {
            WebViewCompat.startSafeBrowsing(this, new ValueCallback<Boolean>() {
                @Override
                public void onReceiveValue(Boolean value) {
                    mSafeBrowsingIsInitialized = true;
                    if (!value) {
                        Log.i(TAG, "unable to initialized safe browsing");
                    }
                }
            });

        }
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && mMyWebView.canGoBack()) {
            mMyWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    private class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if ("www.myhost.com".equals(Uri.parse(url).getHost())) {
                return false;
            }
            return super.shouldOverrideUrlLoading(view, url);
        }

//        @Override
//        public void onSafeBrowsingHit(WebView view, WebResourceRequest request, int threatType, SafeBrowsingResponse callback) {
//            super.onSafeBrowsingHit(view, request, threatType, callback);
//
//
//
//        }
    }




}
