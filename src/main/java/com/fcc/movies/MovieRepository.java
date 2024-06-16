package com.fcc.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Custom query to find a movie by its imdbId as MovieRepository only supports
    // finding by ObjectId by default
    Optional<Movie> findMovieByImdbId(String imdbId);
}
