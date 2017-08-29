package com.example.demo.service;

import com.example.demo.object.Users;

import java.util.Collection;


public interface UsersService {

    public Collection<Users> getAllUsers();
    public Users findUser(int id);
    public void insertUsers(Users users);
    public void insertUsersAndPeoples(Users users);

}
