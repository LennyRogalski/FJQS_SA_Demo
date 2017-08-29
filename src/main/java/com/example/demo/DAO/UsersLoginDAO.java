package com.example.demo.DAO;

import com.example.demo.object.Users;
import org.springframework.data.repository.CrudRepository;


public interface UsersLoginDAO {

public Boolean findByUsernameAndPassword(String username, String password);



}
