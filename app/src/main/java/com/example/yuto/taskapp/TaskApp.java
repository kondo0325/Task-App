package com.example.yuto.taskapp;

/**
 * Created by yuto on 2018/03/06.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}