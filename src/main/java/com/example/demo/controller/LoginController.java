package com.example.demo.controller;

import com.example.demo.object.Users;
import com.example.demo.service.UsersLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;



@RestController
@RequestMapping("loginU")
public class LoginController {


    @Autowired
    private UsersLoginService usersLoginService;


   @RequestMapping( value = "/loginU" ,method = RequestMethod.POST)
   @ResponseBody
    public  Boolean login(@RequestBody Users users, HttpSession session)
   {
      // @ModelAttribute
       System.out.println("user: " + users.getUsr()+ " password: " + users.getPassword());
       if(usersLoginService.findByUsernameAndPassword(users.getUsr(),users.getPassword()))
       {
           session.setAttribute("usr",users.getUsr());
           session.setAttribute("password",users.getUsr());
           System.out.println("ok");
           return true;
       }else{
           System.out.println("not ok");
           return false;
       }
   }


}
