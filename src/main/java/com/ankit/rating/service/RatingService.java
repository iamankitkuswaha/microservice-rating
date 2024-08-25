package com.ankit.rating.service;

import com.ankit.rating.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating createdRating(Rating rating);
    List<Rating> getAllRatings();
    Rating getRating(String id);
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);
}
