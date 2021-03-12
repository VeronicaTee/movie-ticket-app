package com.veronicatee.movieapp.services;

import com.veronicatee.movieapp.models.Movie;

import java.util.List;


public interface MovieService{
//    public Movie getImageFromResourceUrl(String searchTerm);
//    public Movie getMovieByTitle (String title);
    public List<Movie> getAllMovies();
    public Movie getMovieById(Long id);
}
