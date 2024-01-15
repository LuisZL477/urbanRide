package com.example.urban_ride.interfaces;

import com.google.android.gms.maps.model.LatLng;

public interface GeoListener {

    void onGeoFound(LatLng latLng);
}
