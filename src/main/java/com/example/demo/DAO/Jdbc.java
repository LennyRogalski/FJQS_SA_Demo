package com.example.demo.DAO;

import com.example.demo.object.Peoples;
import com.example.demo.object.Users;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Collection;



public interface Jdbc {

    public Collection<Peoples> getAllPeoples();
    public Peoples findPeople(int id);
    public void insertPeoples(Peoples peoples);


    public Collection<Users> getAllUsers();
    public Users findUser(int id);
    public void insertUsers(Users users);
    public int insertUsersAndPeoples(Users users);





}
