package com.example.demo.object;


public class Peoples {


    private int id_user_details;
    private int id_user;
    private String usr_name;
    private int user_age;

    public Peoples(){

    }

    public Peoples(int id_user_details, int id_user, String usr_name, int user_age) {
        this.id_user_details = id_user_details;
        this.id_user = id_user;
        this.usr_name = usr_name;
        this.user_age = user_age;
    }

    public int getId_user_details() {
        return id_user_details;
    }

    public void setId_user_details(int id_user_details) {
        this.id_user_details = id_user_details;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }
}
