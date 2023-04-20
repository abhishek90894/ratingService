package com.ratingService.Service;

import com.ratingService.entity.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
   List<Rating> getAll();

   //get all rating by userId
    List<Rating> getRatingByUserId(String userId);


    //get all rating by hotel
   List<Rating> getRatingByHotelId(String hotelId);

}
