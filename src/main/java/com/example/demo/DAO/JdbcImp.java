package com.example.demo.DAO;

import com.example.demo.object.Peoples;
import com.example.demo.object.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



@Repository
public class JdbcImp implements Jdbc{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Collection<Peoples> getAllPeoples() {
        return this.jdbcTemplate.query("select * from peoples",new BeanPropertyRowMapper<Peoples>(Peoples.class));
    }

    @Override
    public Peoples findPeople(int id) {
        return jdbcTemplate.queryForObject("select * from peoples where id=? ", new BeanPropertyRowMapper<Peoples>(Peoples.class),id);
    }

    @Override
    public void insertPeoples(Peoples peoples) {

        String insert = "insert into peoples (id_user,usr_name,user_age) values(?,?,?)";
        jdbcTemplate.update(insert,peoples.getId_user(),peoples.getUsr_name(),peoples.getUser_age());
    }

    @Override
    public Collection<Users> getAllUsers() {
        return this.jdbcTemplate.query("select * from users",new BeanPropertyRowMapper<Users>(Users.class));
    }

    @Override
    public Users findUser(int id) {
        return jdbcTemplate.queryForObject("select * from users where id=? ", new BeanPropertyRowMapper<Users>(Users.class),id);
    }

    @Override
    public void insertUsers(Users users) {
        String insert = "insert into users(usr,password) values(?,?);";
        jdbcTemplate.update(insert,users.getUsr(),users.getPassword());
    }

    @Override
    public int insertUsersAndPeoples(Users users) {


        KeyHolder keyHolder =  new GeneratedKeyHolder();
        String insert = "insert into users(usr,password) values(?,?);";
        String usr = users.getUsr();
        String password = users.getPassword();


        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

                        PreparedStatement ps = connection.prepareStatement(insert, new String[]{"id_user"});
                        ps.setString(1,usr);
                        ps.setString(2,password);
                        return ps;
                    }
                },
                keyHolder);
        return (int)keyHolder.getKey();
    }
}
