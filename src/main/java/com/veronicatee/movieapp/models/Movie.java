package com.veronicatee.movieapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable {



    private String original_title;
    private long id;
    private boolean video;
    private long vote_average;
    private String overview;

    private String release_date;
    private long vote_count;
    private boolean adult;
    private String backdrop_path;
    private String title;

//    private List<Long> genre_ids;

    private String poster_path;
    private String original_language;
    private long popularity;
    private String media_type;


}
