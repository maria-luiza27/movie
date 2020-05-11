package com.example.proiectMovies.dao;

import java.util.List;
import com.example.proiectMovies.model.Movies;
import com.example.proiectMovies.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    Review findByMoviesId(long id);

    List<Review> findAllByMoviesId(long id);}