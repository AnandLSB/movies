package com.fcc.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository; // Reference to the repository

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
