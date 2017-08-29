package com.example.demo.controller;

import com.example.demo.object.Peoples;
import com.example.demo.object.Users;
import com.example.demo.service.PeoplesService;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;




@RestController
@RequestMapping("rest")
public class PeoplesController {

    @Autowired
    private PeoplesService peoplesService;

    @Autowired
    private UsersService usersService;


    @RequestMapping(value="/people")
    public List<Peoples> test(){

        List<Peoples> peoples = (List)peoplesService.getAllPeoples();
        return peoples;
    }

    @RequestMapping(value="/user")
    public List<Users> user(){

        List<Users> users = (List)usersService.getAllUsers();
        return users;
    }


    @RequestMapping(value = "/updatePeople", method = RequestMethod.POST)
    public ResponseEntity < String > persistPerson(@RequestBody Peoples peoples) {
        peoplesService.insertPeoples(peoples);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ResponseEntity < String > persistUsers(@RequestBody Users users) {
        usersService.insertUsers(users);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/updateUserAndPeoples", method = RequestMethod.POST)
    public ResponseEntity < String > persistUsersAndPeoples(@RequestBody Users users) {
        usersService.insertUsersAndPeoples(users);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
