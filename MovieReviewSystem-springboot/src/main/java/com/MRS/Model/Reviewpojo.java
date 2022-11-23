package com.MRS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reviewpojo {
	
	@Id
	@GeneratedValue
	private int sno;
	private int id;
	private String email;
	private String review;
	private int rating;
	public Reviewpojo() {
		super();
	}
	public Reviewpojo(int sno, int id, String email, String review, int rating) {
		super();
		this.sno = sno;
		this.id = id;
		this.email = email;
		this.review = review;
		this.rating = rating;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
