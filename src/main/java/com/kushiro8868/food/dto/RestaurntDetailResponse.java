package com.kushiro8868.food.dto;

import java.util.List;

public class RestaurntDetailResponse {
    public Long id;
    public String name;
    public String category;
    public String address;
    public String phone;
    public String description;
    public Double avgRating;
    public Integer reviewCount;
    public String createdAt;
    public List<MenuResponse> menus;

    public RestaurntDetailResponse(Long id, String name, String category, String address, String phone, Double avgRating, String description, Integer reviewCount, List<MenuResponse> menus, String createdAt) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.address = address;
        this.phone = phone;
        this.avgRating = avgRating;
        this.description = description;
        this.reviewCount = reviewCount;
        this.menus = menus;
        this.createdAt = createdAt;
    }

    public RestaurntDetailResponse() {




    }
}
