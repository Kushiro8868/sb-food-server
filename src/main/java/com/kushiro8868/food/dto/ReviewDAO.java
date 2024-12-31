package com.kushiro8868.food.dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDAO {


    @Autowired

    private JdbcTemplate jdbcTemplate;

    createReview(long userId, ReviewRequest reviewRequest)
        String sql = 

}
