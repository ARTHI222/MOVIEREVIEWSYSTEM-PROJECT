package com.MRS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addmovies")
public class AddMovies {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String description;
	private int rating;
	private String url;
	public AddMovies() {
		super();
	}
	public AddMovies(int id, String title, String description, int rating, String url) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
