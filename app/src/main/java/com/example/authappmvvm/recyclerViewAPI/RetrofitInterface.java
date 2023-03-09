package com.example.authappmvvm.recyclerViewAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("posts")
    public Call<List<User>> getUsers();
}
