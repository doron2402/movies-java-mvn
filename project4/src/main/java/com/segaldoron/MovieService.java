package com.segaldoron;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.segaldoron.model.Movie;

public class MovieService {
	
	public List<Movie> getAll() {
		
		try {
			
			Movie m1 = new Movie(1, "movie aaa", new URL("http://www.movie-aaa.com"));
			Movie m2 = new Movie(2, "movie bbb", new URL("http://www.movie-bbb.com"));
			Movie m3 = new Movie(3, "movie ccc", new URL("http://www.movie-cccc.com"));
			List<Movie> movies = Arrays.asList(m1, m2, m3);
			return movies;
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Collections.emptyList();
		}  
		
		
	}
}
