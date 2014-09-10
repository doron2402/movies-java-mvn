package com.segaldoron;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.segaldoron.model.Movie;

@Controller
@EnableAutoConfiguration
public class TestController {
	
	private static final TestContent content = new TestContent();
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    String home() {
    	return content.get("home");
    }
    
    @RequestMapping(value = "/contact", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    String contact() {
    	return content.get("contact");
    }
    
    @RequestMapping(value = "/about", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    String About() {
    	return content.get("about");
    }
    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
    
    @Bean
    private MovieService movieService() {
    	return new MovieService();
    }
    
    @RequestMapping(value = "/movies", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    List<Movie> getAllMovies() {
    	List<Movie> movies = movieService.getAll();
    	return movies;
    }
    
    @RequestMapping(value = "/movies/{id}", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    Movie getMovieByID(@PathVariable("id") int id) { 
    	List<Movie> movies = movieService.getAll();
    	for (Movie m : movies) {
    		if (m.getId() == id) {
    			return m;
    		}
    	}
    	return null;
    }

    @RequestMapping(value = "/movies/name/{name}", method = RequestMethod.GET,headers="Accept=application/json")
    @ResponseBody
    List<Movie> getMovieByID(@PathVariable("name") String name) { 
    	List<Movie> movies = movieService.getAll();
    	List<Movie> moviesFounded = new ArrayList<Movie>();
    	
    	for (Movie m : movies) {
    		if (m.getName().indexOf(name) != -1) {
    			moviesFounded.add(m);
    		}
    	}
    	return moviesFounded;
    }

}