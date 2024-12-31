package com.kushiro8868.food.dto;

public class ReviewRequest {


        Long restaurantId;
        Long menuId;
        Integer rating;
        String content;

    public ReviewRequest() {
    }

    public ReviewRequest(Long restaurantId, Long menuId, Integer rating, String content) {
        this.restaurantId = restaurantId;
        this.menuId = menuId;
        this.rating = rating;
        this.content = content;
    }
}
