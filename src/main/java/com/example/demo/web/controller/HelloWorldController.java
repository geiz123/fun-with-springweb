package com.example.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Continent;
import com.example.demo.repository.ContinentDAO;

@RestController
public class HelloWorldController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ContinentDAO continentDAO;

    @GetMapping(value = "/hello")
    public String hello()
    {
        return "Hello World" + jdbcTemplate.toString();
    }

    @GetMapping(value = "/continents")
    public List<Continent> getContinents()
    {
        return continentDAO.getContinents();
    }
}
