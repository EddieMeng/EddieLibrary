package cn.meng.application.dataSecurity;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Cryptography {

    public Cryptography() {

    }

    public void encryptMessage(String message) throws Throwable{
        byte[] messageByteStream = message.getBytes();
        // Advance Encryption Standard : symmetric encryption algorithum
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        // RSA : asymmetric encryption algorithum



    }




}
