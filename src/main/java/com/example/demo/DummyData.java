package com.example.demo;
import com.example.demo.models.Category;
import com.example.demo.models.Client;
import com.example.demo.models.Movies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DummyData implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public DummyData(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {
        //Register new Client
        Client newClient = feignRestClient.registerClient(new Client("92494","Amos Waihuini"));
        System.out.println("...........Creating Client.............");
        System.out.println(newClient.toString());

        //Client to View all categories
        List<Category> availableCategory = feignRestClient.viewCategories();
        System.out.println("...........Fetching Categories.............");
        System.out.println(availableCategory);
//
        //Client to view specific category
        Category viewSpecific = feignRestClient.findByCategoryId(8L);
        System.out.println("...........Fetching Category.............");
        System.out.println(viewSpecific);
//
        //Client to View Movies
        List<Movies> availableMovies = feignRestClient.viewMovies();
        System.out.println("...........Fetching Movies.............");
        System.out.println(availableMovies);
//
//        //Client to view specific movie
        Movies viewSpecificMovie = feignRestClient.findByMovieId(3L);
        System.out.println("...........Fetching Movie.............");
        System.out.println(viewSpecificMovie);
//
////        //Client suggest movie
//        Movies newmovie = feignRestClient.createMovies(new Movies("XMen","Suggested",availableCategory));
//        System.out.println(newmovie);
//
////        //Client update movie
////        Movies updatedMovie = feignRestClient.updateMovies(newmovie.getId(),newClient.getId(),new Movies("","",availableCategory));
////        System.out.println(updatedMovie.toString());
////
////        //Client delete
////        Void deletedMovie = feignRestClient.deleteMovie(newmovie.getId(),newClient.getId());




    }
}

