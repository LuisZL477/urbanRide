package com.example.urban_ride.utils;


import android.app.Activity;
import android.content.Context;
import android.database.Cursor;

import android.util.Log;
import android.widget.Toast;

import com.example.urban_ride.managers.ResourceManager;
import com.facebook.core.BuildConfig;

public class Utils {
     public static void Toast(int id){
         Toast.makeText(ResourceManager.getInstance().getContext(), ResourceManager.getInstance().getString(id), Toast.LENGTH_SHORT).show();
     }

     public static void printDebug(String debug){
         if(BuildConfig.DEBUG){
             Log.d("Bani", debug);
         }
     }

     public static void printealldatabase(Cursor elcursor){
         elcursor.moveToFirst();
         for (int i=0;i<elcursor.getCount();i++){


             elcursor.move(1);
         }
     }
}
