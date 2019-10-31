package com.example.demo;

import com.example.demo.models.Category;
import com.example.demo.models.Client;
import com.example.demo.models.Movies;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "client", url = "http://10.51.12.57:2000", configuration = FeignConfig.class)
public interface FeignRestClient {
    //Register Client
    @RequestMapping(method = RequestMethod.POST, value = "users")
    Client registerClient(@RequestBody Client client);

    //View  all categories
    @RequestMapping(method = RequestMethod.GET, value= "categories")
    List<Category> viewCategories();

    //View specific category
    @RequestMapping(method = RequestMethod.GET, value= "categories/{id}")
    Category findByCategoryId(@PathVariable(name = "id") Long id);

    //View all movies
    @RequestMapping(method = RequestMethod.GET, value= "movies")
    List<Movies> viewMovies();

    //View specific movie
    @RequestMapping(method = RequestMethod.GET, value= "movies/{id}")
    Movies findByMovieId(@PathVariable(name = "id") Long id);

    //Client create
    @RequestMapping(method = RequestMethod.POST, value = "users/{userId}/movies")
    Movies createMovies(@PathVariable(value="userId")Long userId, @RequestBody Movies movies);

    //Client update
    @RequestMapping(method = RequestMethod.PATCH, value = "movies/{id}")
    Movies  updateMovies(@PathVariable(value = "id") Long id,@RequestParam(value = "userId") Long userId,@RequestBody Movies movies);

    //Client delete
    @RequestMapping(method = RequestMethod.DELETE,value = "movies/{id}")
    Void deleteMovie(@PathVariable(value = "id") Long id, @RequestParam(value = "userId") Long userId);


}
