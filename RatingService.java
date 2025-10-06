package com.hotel.rating_service.service;

import com.hotel.rating_service.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating create(Rating rating);
    List<Rating> getAllRatings();

    List<Rating> getRatingsByUserId(String ratingId);
    List<Rating> getRatingsByHotelId(String hotelId);
    Rating updateRating(String ratingId, Rating updatedRating);
    void deleteRating(String ratingId);
    void validateRating(Rating rating);
}
