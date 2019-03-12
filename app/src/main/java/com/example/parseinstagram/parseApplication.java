package com.example.parseinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class parseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aaliyah-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("CodepathInstagramMoveFast")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://aaliyah-instagram-codepath.herokuapp.com/parse").build());
    }
}
