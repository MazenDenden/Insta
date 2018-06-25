package com.esprit.mazen.insta.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
 * User class
 */

public class User {

    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
