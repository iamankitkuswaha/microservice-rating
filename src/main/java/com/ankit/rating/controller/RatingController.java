package com.ankit.rating.controller;

import com.ankit.rating.entity.Rating;
import com.ankit.rating.service.RatingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody @Valid Rating rating){
        return new ResponseEntity<>(ratingService.createdRating(rating), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        return new ResponseEntity<>(ratingService.getAllRatings(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rating> getRating(@PathVariable("id") String id){
        return new ResponseEntity<>(ratingService.getRating(id),HttpStatus.OK);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable("userId") String userId){
        return new ResponseEntity<>(ratingService.getRatingByUserId(userId),HttpStatus.OK);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable("hotelId") String hotelId){
        return new ResponseEntity<>(ratingService.getRatingByHotelId(hotelId),HttpStatus.OK);
    }
}
