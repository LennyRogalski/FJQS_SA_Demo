package com.example.demo.service;

import com.example.demo.object.Peoples;

import java.util.Collection;

public interface PeoplesService {


    public Collection<Peoples> getAllPeoples();
    public Peoples findPeople(int id);
    public void insertPeoples(Peoples peoples);


}
