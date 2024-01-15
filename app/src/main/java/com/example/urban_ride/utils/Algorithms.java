package com.example.urban_ride.utils;

public class Algorithms {

    public static boolean isEmpty(String s){return s == null || s.length()==0; }

    static boolean objectEquals(Object a, Object b){
        if(a== null){
            return b==null;
        }else{
            return a.equals(b);
        }
    }

}
