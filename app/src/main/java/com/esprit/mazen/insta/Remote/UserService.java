package com.esprit.mazen.insta.Remote;

import com.esprit.mazen.insta.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/*
 * Class that contains the Users relative methods
 */

public interface UserService {

    @POST("Login.php")
    @FormUrlEncoded
    Call<User> login(@Field("username") String username, @Field("password") String password);

}
