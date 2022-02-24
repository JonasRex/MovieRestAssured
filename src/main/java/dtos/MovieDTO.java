/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class MovieDTO {
    private long id;
    private int year;
    private String title;
    private List<String> actors;

    public MovieDTO(int year, String title, List<String> actors) {
        this.year = year;
        this.title = title;
        this.actors = actors;
    }

    public static List<MovieDTO> getDtos(List<Movie> movies){
        List<MovieDTO> moviedtos = new ArrayList();
        movies.forEach(movie->moviedtos.add(new MovieDTO(movie)));
        return moviedtos;
    }


    public MovieDTO(Movie movie) {
        if(movie.getId() != null)
            this.id = movie.getId();
        this.year = movie.getYear();
        this.title = movie.getTitle();
        this.actors = movie.getActors();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    //    @Override
//    public String toString() {
//        return "RenameMeDTO{" + "id=" + id + ", str1=" + str1 + ", str2=" + str2 + '}';
//    }


    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", actors=" + actors +
                '}';
    }
}
