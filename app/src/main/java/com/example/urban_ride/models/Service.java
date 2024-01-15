package com.example.urban_ride.models;

import com.example.urban_ride.managers.ResourceManager;

public class Service {

    private int name;

    private int identifier;

    private double min;

    private double max;

    private boolean isDynamic;

    public Service(int name, int identifier, double min, double max, boolean isDynamic){
        this.name = name;
        this.identifier = identifier;
        this.min = min;
        this.max = max;
        this.isDynamic = isDynamic;
    }




}
