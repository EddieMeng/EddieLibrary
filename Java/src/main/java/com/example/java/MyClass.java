package com.example.java;

import java.util.concurrent.ExecutorService;

public class MyClass {

    public static void main(String[] args) {
        String city = "广州";
        byte[] byteResult = city.getBytes();
        // todo
        System.out.println(byteResult.length);

        char[] charArray = city.toCharArray();
        System.out.println(charArray.length);

        Integer a = 300;
        Integer b = 300;
        if (a == b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }



}
