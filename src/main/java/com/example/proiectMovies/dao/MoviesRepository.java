package com.example.proiectMovies.dao;

import com.example.proiectMovies.model.Movies;
import org.springframework.data.repository.CrudRepository;
/*
* Interface which allows us to communicate programmatically with the database.
* For example, this interface allows us to communicate with the Movies table having a Long type primary key (the @Id one)
* */
public interface MoviesRepository extends CrudRepository<Movies,Long> {

}
