package com.example.karthi.retrofit2_example.Helper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    // http://192.168.0.30/mcarsWebServices/api/login/username=passwordadmin@mcars.in&=myadmin
    // public static final String BASE_URL = "http://192.168.0.25:81/mcars/";
//    public static final String BASE_URL = "http://192.168.0.25/mcars/";
    public static final String BASE_URL = "http://www.karthi.zz.mu/";

    private static Retrofit retrofit1 = null;

    public static Retrofit getClient() {
        if (retrofit1 == null) {
            retrofit1 = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit1;
    }
}