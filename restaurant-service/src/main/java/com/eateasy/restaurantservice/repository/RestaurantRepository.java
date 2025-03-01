package com.eateasy.restaurantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eateasy.restaurantservice.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}

