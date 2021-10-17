package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MInXefBPRQna2nURhVznDFEq1CaS7ibfjeKmY5MM")
                .clientKey("vZ7RZ23t2ReZywyrN54DiXejrDRN9ZVi9a8wyRRw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
