package com.example.demo.DAO;

import com.example.demo.object.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class UsersLoginDAOImp implements UsersLoginDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Boolean findByUsernameAndPassword(String username, String password) {
        try {
            jdbcTemplate.queryForObject("select usr, password from users where usr=? and password=?; ", new BeanPropertyRowMapper<Users>(Users.class), username, password);
            return true;
        }catch (EmptyResultDataAccessException e)
        {
            return false;
        }
    }
}
