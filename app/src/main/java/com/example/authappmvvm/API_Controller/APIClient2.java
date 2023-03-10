package com.example.authappmvvm.API_Controller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient2 {
    private static Retrofit retrofit = null;
    public static APIInterface getClient() {

        // change your base URL
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://reqres.in/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //Creating object for our interface
        APIInterface api = retrofit.create(APIInterface.class);
        return api; // return the APIInterface object

    }
}
