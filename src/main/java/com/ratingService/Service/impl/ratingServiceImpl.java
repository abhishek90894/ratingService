package com.ratingService.Service.impl;

import com.ratingService.Service.RatingService;
import com.ratingService.entity.Rating;
import com.ratingService.repository.ratingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ratingServiceImpl implements RatingService {

    @Autowired
    private ratingRepository ratingRepository;
    @Override
    public Rating create(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        Rating rating1 = ratingRepository.save(rating);

        return rating1;
    }

    @Override
    public List<Rating> getAll() {
        List<Rating> ratings = ratingRepository.findAll();
        return ratings;
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        List<Rating> ratings = ratingRepository.findByUserId(userId);
        return ratings;
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        List<Rating> ratings = ratingRepository.findByHotelId(hotelId);
        return ratings;
    }
}
