package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zFUEGqehonTIVm7RO2h3DLuygeEZs6Omv7VopRFR")
                .clientKey("Soa906rjYnuFPvgJr027RbIbQDGgKuuaLps3Eo3o")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
