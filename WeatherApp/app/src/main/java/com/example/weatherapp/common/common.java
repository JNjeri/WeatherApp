package com.example.weatherapp.common;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class common {
    public static String API_KEY = "02c455ed10f92c0ba6b7bc46a7e57be1";
    public  static  String API_LINK ="http://api.openweathermap.org/data/2.5/weather";

    public static  String apiRequest(String lat, String lng){
        StringBuilder ab = new StringBuilder(API_LINK);
        ab.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return ab.toString();
    }

    public static  String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        java.util.Date date = new java.util.Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }
    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        java.util.Date date = new java.util.Date();
        return dateFormat.format(date);
    }
}
