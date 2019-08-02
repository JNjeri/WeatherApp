package com.example.weatherapp.Model;

public class weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    public weather (int id,String main, String description,String icon){
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public  String getMain(){
        return main;
    }
    public void  setMain(String main){
        this.main = main;
    }
    public String  getDescription(){
        return description;
    }
}
