package com.example.demo.DAO;

import com.example.demo.object.rdProblemeBoards;

import java.util.Collection;

/**
 * Created by wojcikj on 30.08.2017.
 */
public interface rd_ProblemeBoards {

    public Collection<rdProblemeBoards> getAllrdProblemeBoards();
    public rdProblemeBoards findrdProblemeBoards(int id);


}
