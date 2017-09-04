package com.example.demo.controller;

import com.example.demo.object.rdProblemeBoards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.rdProblemeBoardsService;

import java.util.List;

/**
 * Created by wojcikj on 30.08.2017.
 */


@RestController
@RequestMapping("statistic")
public class RdProblemeBoardsController {


    @Autowired
    private rdProblemeBoardsService rdProblemeBoardsService;


    @RequestMapping(value="/problemeBoards")
    public List<rdProblemeBoards> test(){

        List<rdProblemeBoards> rdProblemeBoards = (List)rdProblemeBoardsService.getAllrdProblemeBoards();
        return rdProblemeBoards;
    }

}
