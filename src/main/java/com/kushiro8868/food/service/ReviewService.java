package com.kushiro8868.food.service;


import com.kushiro8868.food.config.JwtConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {


    @Autowired
    JwtConfig jwtConfig;

    public int creatdReview(String torken, Long menuId, String content, Integer score) {
        Long userId = Long.parseLong( jwtConfig.getTokenClaims(token).getSubject() );

        return reviewDAO.createReview(userId, reviewRequest);

    }
}
