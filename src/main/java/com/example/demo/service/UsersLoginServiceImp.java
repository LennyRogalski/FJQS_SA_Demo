package com.example.demo.service;

import com.example.demo.DAO.UsersLoginDAO;
import com.example.demo.object.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("usersLoginService")
//@Transactional
public class UsersLoginServiceImp implements  UsersLoginService {

    @Autowired
    private UsersLoginDAO usersLoginDAO;

    @Override
    public Boolean findByUsernameAndPassword(String username, String password) {
        return usersLoginDAO.findByUsernameAndPassword(username,password);
    }
}
