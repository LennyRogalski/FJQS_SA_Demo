package com.example.demo.service;

import com.example.demo.DAO.rd_ProblemeBoards;
import com.example.demo.object.rdProblemeBoards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by wojcikj on 30.08.2017.
 */

@Service
public class rdProblemeBoardsServiceImp  implements rdProblemeBoardsService {

    @Autowired
    private rd_ProblemeBoards rdProblemeBoards;


    @Override
    public Collection<rdProblemeBoards> getAllrdProblemeBoards() {
        return this.rdProblemeBoards.getAllrdProblemeBoards();
    }

    @Override
    public rdProblemeBoards findrdProblemeBoards(int id) {
        return this.rdProblemeBoards.findrdProblemeBoards(id);
    }
}
