package com.android.myapplication;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApp extends Application {
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vu0hSmSmFW2ypyUk3oumkcOfQg1truQyPCJ3ng1H")
                .clientKey("fSL3bPEMX8uJKiY7PZWq1GAEgrpiNiDbQOMT2P9R")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
