package com.example.demo.DAO;

import com.example.demo.object.Peoples;
import com.example.demo.object.rdProblemeBoards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by wojcikj on 30.08.2017.
 */

@Repository
public class rd_ProblemeImpBoards implements rd_ProblemeBoards {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Collection<rdProblemeBoards> getAllrdProblemeBoards() {
        return this.jdbcTemplate.query("select * from Statistik.dbo.3rd_Probleme_Boards",new BeanPropertyRowMapper<rdProblemeBoards>(rdProblemeBoards.class));
        //return this.jdbcTemplate.query("select * from [Statistik].[dbo].[3rd_Probleme_Boards]",new BeanPropertyRowMapper<rdProblemeBoards>(rdProblemeBoards.class));
    }

    @Override
    public rdProblemeBoards findrdProblemeBoards(int id) {
        return jdbcTemplate.queryForObject("select * from [Statistik].[dbo].[3rd_Probleme_Boards] where id=? ", new BeanPropertyRowMapper<rdProblemeBoards>(rdProblemeBoards.class),id);
    }
}
