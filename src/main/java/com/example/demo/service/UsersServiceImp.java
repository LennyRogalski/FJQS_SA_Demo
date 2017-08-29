package com.example.demo.service;

import com.example.demo.DAO.Jdbc;
import com.example.demo.object.Peoples;
import com.example.demo.object.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class UsersServiceImp implements UsersService{

    @Autowired
    private Jdbc jdbc;

    @Autowired
    private PeoplesService peoplesService;


    @Override
    public Collection<Users> getAllUsers() {
        return this.jdbc.getAllUsers();
    }

    @Override
    public Users findUser(int id) {
        return this.jdbc.findUser(id);
    }

    @Override
    public void insertUsers(Users users) {
        this.jdbc.insertUsers(users);
    }

    @Override
    public void insertUsersAndPeoples(Users users) {

        Peoples peoples = new Peoples();

        int id = this.jdbc.insertUsersAndPeoples(users);
        peoples.setId_user(id);
        peoples.setUser_age(users.getPeoples().getUser_age());
        peoples.setUsr_name(users.getPeoples().getUsr_name());

        this.peoplesService.insertPeoples(peoples);
    }
}
