package cn.beauty.network;

import java.net.ServerSocket;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Simon Meng on 2018/3/29.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class ApiClient {

    private static Retrofit sRetrofit = null;

    public static Retrofit getClient() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        sRetrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return sRetrofit;
    }


}
