package com.veronicatee.movieapp.controllers;

import com.veronicatee.movieapp.models.Movie;
import com.veronicatee.movieapp.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/single-movie/{movieId}")
    public String singleMovie(Model model, @PathVariable("movieId") String movieId) {

        Movie movie = new Movie();

        model.addAttribute("movie", movie);

        return "movie";
    }

    @GetMapping("/all-movies")
    public List<Movie> viewMoviePage() {
        List<Movie> movies = movieService.getAllMovies();

        return movies;
    }



}
