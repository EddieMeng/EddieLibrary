package cn.beauty.network;

import retrofit2.Retrofit;

/**
 * Created by Simon Meng on 2018/3/29.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class ApiClient {

    private static Retrofit sRetrofit = null;

    public static Retrofit getClient() {
        sRetrofit = new Retrofit.Builder().baseUrl("https://reqres.in").build();
        return sRetrofit;
    }


}
