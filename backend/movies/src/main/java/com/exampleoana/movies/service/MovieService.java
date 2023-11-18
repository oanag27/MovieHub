package com.exampleoana.movies.service;

import com.exampleoana.movies.domain.Movie;
import com.exampleoana.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//write db methods
@Service
public class MovieService {
    @Autowired //framework will instantiate the class
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();   //
    }
    //might not find a movie with the id given
    public Optional<Movie> movieId(ObjectId id){
        return movieRepository.findById(id);
    }
    public Optional<Movie> movie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
