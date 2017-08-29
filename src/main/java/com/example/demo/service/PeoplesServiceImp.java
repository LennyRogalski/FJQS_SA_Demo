package com.example.demo.service;

import com.example.demo.DAO.Jdbc;
import com.example.demo.object.Peoples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;




@Service
public class PeoplesServiceImp implements PeoplesService {

    @Autowired
    private Jdbc jdbc;


    @Override
    public Collection<Peoples> getAllPeoples() {
        return this.jdbc.getAllPeoples();
    }

    @Override
    public Peoples findPeople(int id) {
        return this.jdbc.findPeople(id);
    }

    @Override
    public void insertPeoples(Peoples peoples) {
        jdbc.insertPeoples(peoples);
    }
}
