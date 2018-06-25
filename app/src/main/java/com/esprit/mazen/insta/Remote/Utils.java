package com.esprit.mazen.insta.Remote;

/*
 * Class that contains Basic URLS
 */

public class Utils {
    public static final String BASE_URL = "http://192.168.1.5/Insta/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
