package com.veronicatee.movieapp.services;

import com.veronicatee.movieapp.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private RestTemplate restTemplate;
//    private MovieRepository movieRepository;



//    @Override
//    public Movie getImageFromResourceUrl(String searchTerm){
//        String baseUrl = "http://www.omdbapi.com/?t=";
//        String key = "&apikey=d970510c";
//        String resourceUrl = baseUrl + searchTerm + key;
//        System.out.println(resourceUrl);
//        restTemplate = new RestTemplate();
//        Movie movie =  restTemplate.getForObject(resourceUrl, Movie.class);
//
//        return movie;
//    }

    // TODO: Get all movies
    @Override
    public List<Movie> getAllMovies (){
        String baseUrl = "https://api.themoviedb.org/3/trending/movie/week?";
        String key = "api_key=6c0174b6d49ba116ad5ebbc4085debc4";
        String resourceUrl = baseUrl + key;
//        System.out.println(resourceUrl);
        restTemplate = new RestTemplate();
        List<Movie> movies =  restTemplate.exchange(resourceUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Movie>>() {
        }).getBody();

        System.out.println("movies: " + movies);

        return movies;
    }



    // TODO: Get movie by id
    @Override
    public Movie getMovieById(Long id) {
//        Optional<Movie> optional = movieRepository.findById(id);
//
//        Movie movie = null;
//        if (optional.isPresent()) {
//            movie = optional.get();
//
//        } else {
//            throw new RuntimeException(id + "movie not found!!!");
//        }
//        return movie;



        String baseUrl = "https://api.themoviedb.org/3/trending/movie/week?";
        String key = "api_key=6c0174b6d49ba116ad5ebbc4085debc4";
        String resourceUrl = baseUrl + key;
//        System.out.println(resourceUrl);
        restTemplate = new RestTemplate();
        Movie movie =  restTemplate.getForObject(resourceUrl, Movie.class);

        return movie;


    }
}
