/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.MovieDTO;
import entities.Movie;

import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        MovieFacade fe = MovieFacade.getMovieFacade(emf);


        List<String> actors1 = new ArrayList<>();
        actors1.add("Peter Nielsen");
        actors1.add("Allan Hansen");

        List<String> actors2 = new ArrayList<>();
        actors2.add("Connie Olsen");
        actors2.add("Dennis Knudsen");

        List<String> actors3 = new ArrayList<>();
        actors2.add("Sanne Knudsen");
        actors2.add("Britta Nielsen");



        fe.create(new MovieDTO(new Movie(2000, "Movie A", actors1)));
        fe.create(new MovieDTO(new Movie(2010, "Movie B", actors2)));
        fe.create(new MovieDTO(new Movie(2008, "Movie C", actors3)));
    }
    
    public static void main(String[] args) {
        populate();
    }
}
