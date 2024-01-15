package com.example.urban_ride.utils;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class Fonts {

    public static Typeface getBoldTypeface(Context context){
        HashMap<String, Typeface> fontCache = new HashMap<>();
        Typeface typeface = fontCache.get("texgyreadventor-bold.otf");
        if (typeface == null){
            try{
                typeface = Typeface.createFromAsset(context.getAssets(), "texgyreadventor-bold.otf");

            } catch (Exception e){
                return null;
            }
            fontCache.put("texgyreadventor-bold.otf", typeface);
        }
        return typeface;
    }

}
