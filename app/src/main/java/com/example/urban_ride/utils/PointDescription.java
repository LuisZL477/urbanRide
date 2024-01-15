package com.example.urban_ride.utils;

import androidx.annotation.NonNull;

public class PointDescription {

    private String type;

    private String name;

    private String typeName;

    private double lat = 0;

    private double lon = 0;

    public static final String POINT_TYPE_LOCATION = "location";

    public PointDescription(double lat, double lon){
        this(POINT_TYPE_LOCATION, "");
        this.lat = lat;
        this.lon = lon;
    }

    public PointDescription(String type, String name){
        this.type = type;
        this.name = name;
        if (this.name == null){
            this.name = "";
        }
    }

    public void setName(String name){
        this.name = name;
        if(this.name == null){
            this.name = "";
        }
    }

    @NonNull
    public String getName(){return name;}

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
        result = prime * result + ((lat == 0) ? 0 : new Double(lat).byteValue());
        result = prime * result + ((lon == 0) ? 0 : new Double(lon).hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        PointDescription other = (PointDescription) obj;
        return Algorithms.objectEquals(other.name, name)
                && Algorithms.objectEquals(other.type, type)
                && Algorithms.objectEquals(other.lat, lat)
                && Algorithms.objectEquals(other.lon, lon)
                && Algorithms.objectEquals(other.typeName, typeName);

    }
}
