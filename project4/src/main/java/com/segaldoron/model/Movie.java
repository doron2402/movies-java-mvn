package com.segaldoron.model;

import java.net.URL;

public class Movie {

	private int id;
	private String name;
	private URL url;
	private int total_views; 
	
	public Movie(int id, String name, URL url) {
		this.id = id;
		this.name = name;
		this.url = url;
	}
	
	public int getTotal_views() {
		return total_views;
	}
	public void setTotal_views(int total_views) {
		this.total_views = total_views;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public URL getUrl() {
		return url;
	}
	
	public void setUrl(URL url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + "]";
	}
}
