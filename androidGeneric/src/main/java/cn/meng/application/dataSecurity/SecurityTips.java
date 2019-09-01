package cn.meng.application.dataSecurity;

import android.content.Context;
import android.os.Environment;
import android.webkit.WebView;

import java.io.File;

/**
 * 1.Do not save sensitive imformation in extetnal storeage, store in internal storage.
 *
 * 2.Perform input validation when handling data from external storage, such as the file must be signed or
 * cryptographically verified.
 *
 * 3.do not request unnecessary permission, makes your app less vulnerable for attackers.
 *
 * 4.store or transmit sensitive data the less the better.
 *
 * 5.production apps should limit log usage, by use custom Log classes with easily configurable logging levels.
 *
 * 6.exposing webview addJavaScriptInterface() only to JavaScript that is contained within your
 * application apk.
 *
 * 7.If webview access sensitive data, call clearCache to delete file stored locally.
 */


public class SecurityTips {


    public SecurityTips(Context context) {
        storeOnInternalStorage(context);
    }

    private void storeOnInternalStorage(Context context) {
        // no need user permission
        context.getFilesDir();
    }

    private void storeOnExternalStorage(Context context) {
        // need write file permission
        if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
            File file = Environment.getExternalStorageDirectory();
        }
    }

    private void storeOnContentProvider(Context context) {

    }

    private void requestPermission() {


    }

    private void createPermission() {


    }

    private void handleUserData() {


    }

    /**
     * improper use can cause cross-site-scripting
     */
    private void useWebView(Context context) {
        WebView myWebView = new WebView(context);
    }


    private void handleCredentials() {


    }

    private void useCryptography() {
//        KeyGenerator
//        SecureRandom
//        KeyStore

        // uses existing cryptographic algorithums, such as AES and RSA provided in the Cipher class

        // How AES encryption works
        // RSA
    }


    private void useInterProcessCommunication() {
        // if your ipc mechanism is not intended by other application, set android:exported = false;
        // if you ipc is responsible to other application signed with same key, set android:protectionLevel = "signature"
    }
















}
