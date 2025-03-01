package com.eateasy.restaurantservice.controller;

import org.springframework.web.bind.annotation.*;

import com.eateasy.restaurantservice.model.Restaurant;
import com.eateasy.restaurantservice.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<Restaurant> getRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }
}
