package com.example.demo.object;


public class Users {


    private int id_user;
    private String usr;
    private String password;
    private Peoples peoples;

    public Users ()
    {

    }

    public Users(int id_user, String usr, String password) {
        this.id_user = id_user;
        this.usr = usr;
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsr() {
        return usr;
    }

    public Peoples getPeoples() {
        return peoples;
    }

    public void setPeoples(Peoples peoples) {
        this.peoples = peoples;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
