package com.example.premkamon.kan;

import android.app.AlertDialog;

/**
 * Created by This PC on 10/3/2016.
 */

public class MyMember {
    @com.google.gson.annotations.SerializedName("username")
    private String txtName;

    @com.google.gson.annotations.SerializedName("password")
    private String txtName1;

    public MyMember() {

    }
    public MyMember(String username, String password)
    {
        this.settxtName(username);
        this.settxtName1(password);
    }

    public final void settxtName(String username) {
        mUsername = username;
        }
    public String getUsername() {
        return mUsername;
        }
    public final void settxtName1(String password) {
        mPassword = password;
        }
    public String getPassword() {
        return mPassword;
        }
}
