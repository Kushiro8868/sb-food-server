package com.kushiro8868.food.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {


    @PostMapping("/api/v1/reviews")
    createReview(@RequestHeader("Authorization") String token){

    }





}
