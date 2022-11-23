package com.MRS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MRS.Model.AddMovies;
import com.MRS.Model.Login;
import com.MRS.Model.Reviewpojo;
import com.MRS.Repository.Addmovierepo;
import com.MRS.Repository.Loginrepo;
import com.MRS.Repository.Review;

import antlr.collections.List;

import java.util.*;




@Service
public class MainService {
	
	@Autowired
	private Loginrepo lrepo;
	
	@Autowired
	private Addmovierepo amrepo;
	
	@Autowired
	private Review reviewrepo;

	public String login(Login l) {
		String email=l.getEmail();
		String password=l.getPassword();
		System.out.println("Entered"+password);
		
	 Login fetch=	lrepo.findbyemail(email);
	 if(fetch==null) 
	 {
	   return "Email Id Not Found";
	   //Email Not Found
	   
	 }
		String fpassword=fetch.getPassword();
		
		System.out.println("Fetched "+fpassword);
		
		if(password.equals(fpassword)) 
		{
			return "Ok";
			//login done
		}
		else 
		{
		return "Invalid Login Details";
		//wrong details
		}
	}
	public String register(Login r) {
		lrepo.save(r);
		return "Hi "+r.getEmail()+" Registration Successfull ";
	}
	public String userlogin(Login ul) {
		String email=ul.getEmail();
		String password=ul.getPassword();
		System.out.println("Entered"+password);
		
	 Login fetch=	lrepo.findbyemailuser(email);
	 if(fetch==null) 
	 {
	   return "Email Id Not Found";
	   //Email Not Found
	   
	 }
		String fpassword=fetch.getPassword();
		
		System.out.println("Fetched "+fpassword);
		
		if(password.equals(fpassword)) 
		{
			return "Ok";
			//login done
		}
		else 
		{
		return "Invalid Login Details";
		//wrong details
		}
	}
	public String addmovies(AddMovies am) {
	     amrepo.save(am);
		return am.getTitle()+" Movie Is Added Successfully";	
	}

	public java.util.List<AddMovies> allmovies() {
		return amrepo.findAll()  ;}

	public java.util.List<AddMovies> detelemoviebyid(int id) {
		 amrepo.deleteById(id);
		return amrepo.findAll();	 
	}

	public String updatebyid(AddMovies u,int id) {
		int id1=id;
		amrepo.deleteById(id);
		u.setId(id1);
		amrepo.save(u);
		return " Movie Is Updataed Successfully";
	}

	public java.util.List<Login> showallusers() {
		return lrepo.findAll();
	}
	public java.util.List<Login> deteleuserbyid(int id) {
		lrepo.deleteById(id);
		return lrepo.findAll();
	}
	
	public String addreview(Reviewpojo p) {
		reviewrepo.save(p);
		return p.getEmail()+" Review Added successfully";
	}
	public java.util.List<Reviewpojo> getallusersreviews() {
		
		return reviewrepo.findAll();
	}
	public java.util.List<Reviewpojo> getallcomments(int id) {
		
		return reviewrepo.findbyvalue(id);
	}

	
	

	

}
