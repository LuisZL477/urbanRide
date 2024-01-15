package com.example.urban_ride.interfaces;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public interface ParserListener {

    void onFinish(ArrayList<LatLng> result);
}
