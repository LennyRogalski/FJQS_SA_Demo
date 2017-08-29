package com.example.demo.service;

import com.example.demo.object.Users;


public interface UsersLoginService {



    public Boolean findByUsernameAndPassword(String username, String password);
}
