package com.eateasy.restaurantservice.service;

import org.springframework.stereotype.Service;

import com.eateasy.restaurantservice.model.Restaurant;
import com.eateasy.restaurantservice.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}

