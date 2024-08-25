package com.ankit.rating.service.Imp;

import com.ankit.rating.entity.Rating;
import com.ankit.rating.exception.ResourceNotFoundException;
import com.ankit.rating.repository.RatingRepository;
import com.ankit.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImp implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating createdRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRating(String id) {
        return ratingRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Rating is not present with given id."));
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId).orElseThrow(()-> new ResourceNotFoundException("Rating is not present with given userId."));
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId).orElseThrow(()-> new ResourceNotFoundException("Rating is not present with given hotelId."));
    }
}
