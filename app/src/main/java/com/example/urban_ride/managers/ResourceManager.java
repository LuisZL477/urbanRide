package com.example.urban_ride.managers;

import android.app.Application;
import android.content.Context;

public class ResourceManager {

    private static volatile ResourceManager instance;

    private Application application;

    private ResourceManager(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class. ");

        }
    }

    public static ResourceManager getInstance(){
        if(instance == null){
            synchronized (ResourceManager.class){
                if (instance == null){
                    instance = new ResourceManager();
                }
            }
        }

        return instance;
    }

    public void initialize(Application application) {
        this.application = application;
    }

    public String getString(int id) {
        return getContext().getResources().getString(id);
    }

    public Context getContext() {
        return application.getApplicationContext();
    }


}
