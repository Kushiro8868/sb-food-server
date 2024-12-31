package com.kushiro8868.food.service;

import com.kushiro8868.food.dto.PageableResponse;
import com.kushiro8868.food.dto.RestaurantResponse;
import com.kushiro8868.food.dto.RestaurntDetailResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantService {

    getRestaurants(int page, int size){
        int offset = ( page - 1 ) * size;


        restauantDAO.getRestaurants(offset, size);


        List<RestaurantResponse> restaurantResponseList = restaurantDAO.getRestaurants(offset, size);

        int page = page;

        int totalElements = restaurantDAO.getTotalElements();
        int totalPages = (int) Math.ceil((double) totalElements / size);


        getRestaurants(int page, int size, String category){
            int offset = ( page - 1 ) * size;
            List<RestaurantResponse> restaurantResponseList = restaurantDAO.getRestaurantsByCategory(category, offset, size);
            int totalElements = restaurantDAO.getTotalElementsByCategory(category);
            int totalPages = (int) Math.ceil((double) totalElements / size);
            return new RestaurantListResponse(restaurantResponseList);
        }
        // 카테고리가 있는 경우
        int offset = (page - 1) * size;
        restaurantResponseList = restaurantDAO.getRestaurantsByCategory(category, offset, size);

        public ResponseEntity.status(200).body(restaurantListResponse);

        PageableResponse pageableResponse = new PageableResponse(page, size, totalElements, totalPages);


        getRestaurantDetail(long id){

            RestaurntDetailResponse restaurntDetailResponse =
                    new RestaurntDetailResponse();

        }








    }
}
