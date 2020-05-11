package com.example.proiectMovies.service;

import com.example.proiectMovies.dao.MoviesRepository;
import com.example.proiectMovies.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.proiectMovies.dao.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    // This method is used to retrieve all movies from database and return them as a list
    public List<Review> getAllReview() {
        List<Review> reviewList = new ArrayList<>();
        // Get all movies from database and save them in a moviesList object
        reviewRepository.findAll().iterator().forEachRemaining(reviewList::add);
        return reviewList;
    }
}