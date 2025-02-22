package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Continent;

@Repository
public class ContinentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Continent> getContinents() {
        return jdbcTemplate.query("SELECT * FROM continents",
                (rs, rowNum) -> new Continent(rs.getInt("continent_id"), rs.getString("name")));
    }
}
