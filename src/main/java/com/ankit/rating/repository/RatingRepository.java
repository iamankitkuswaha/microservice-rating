package com.ankit.rating.repository;

import com.ankit.rating.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends MongoRepository<Rating, Object> {
    Optional<List<Rating>> findByUserId(String userId);
    Optional<List<Rating>> findByHotelId(String hostelId);
}
