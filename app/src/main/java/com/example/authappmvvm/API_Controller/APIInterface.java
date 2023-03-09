package com.example.authappmvvm.API_Controller;


import com.example.authappmvvm.pojo.MultipleResource;
import com.example.authappmvvm.pojo.SignUpResponse;
import com.example.authappmvvm.pojo.User;
import com.example.authappmvvm.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);


    // API-2
//    @FormUrlEncoded // annotation used in POST type requests
//    @POST("/retrofit/register.php")
//    // API's endpoints
//    Call<SignUpResponse> registration(@Field("name") String name,
//                                      @Field("email") String email,
//                                      @Field("password") String password,
//                                      @Field("logintype") String logintype);


    @FormUrlEncoded // annotation used in POST type requests
    @POST("/api/register")
        // API's endpoints
    Call<SignUpResponse> registration(@Field("email") String email,
                                      @Field("password") String password);

    // In registration method @Field used to set the keys and String data type is representing its a string type value and callback is used to get the response from api and it will set it in our POJO class

}
