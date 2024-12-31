package com.kushiro8868.food.controller;

import com.kushiro8868.food.dto.ReviewRequest;
import com.kushiro8868.food.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewService;


    @PostMapping("/api/v1/reviews")
    createReview(@RequestHeader("Authorization") String token,
                 @RequestBody ReviewRequest reviewRequest);{
        int result = reviewService.createReview(token, reviewRequest);
        if (result == 1){

    }





}
