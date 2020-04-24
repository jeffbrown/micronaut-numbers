package com.micronautnumbers;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.ApplicationContextBuilder;
import io.micronaut.context.env.Environment;

public class NumberApplication extends Application {

    ApplicationContext applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();

        ApplicationContextBuilder builder = ApplicationContext.build(MainActivity.class, Environment.ANDROID);
        applicationContext = builder.start();

        registerActivityLifecycleCallbacks(new DILivecycleCallback());
    }

    private class DILivecycleCallback implements ActivityLifecycleCallbacks {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            applicationContext.inject(activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {

        }

        @Override
        public void onActivityResumed(Activity activity) {

        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {

        }
    }
}
