package com.mustafavefa.foursquarecloneparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RSxhsmGIMV8TSOUieMjiPuapSKdqDfVCvPHsj5Ru")
                .clientKey("O7u0T24V3BS0wRKPJ3peBdsWj4QEB0FEK4rDSVQK")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}