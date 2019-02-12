package seleImplementation;

import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Simon Meng on 2017/11/28.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class MD5Builder {

    public static String makeMD5(String string) {
        Log.i("beforeHash", string);
        MessageDigest md = null;
        String result = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes());
            byte[] byteData = md.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < byteData.length; i ++) {
                stringBuffer.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            Log.i("afterHash", stringBuffer.toString());
            result = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

}
