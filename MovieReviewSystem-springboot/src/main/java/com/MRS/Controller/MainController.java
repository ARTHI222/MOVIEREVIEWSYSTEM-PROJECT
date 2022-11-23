package com.MRS.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MRS.Model.AddMovies;
import com.MRS.Model.Login;
import com.MRS.Model.Reviewpojo;
import com.MRS.Service.MainService;

@RestController
@CrossOrigin
public class MainController {

	@Autowired
	private MainService sr;
	
	
	@PostMapping("/adminlogin")
	public String login(@RequestBody Login l) {
		return sr.login(l);
	}
	
	@PostMapping("/register")
	public String register(@RequestBody Login r) {
		return sr.register(r);
	}
	
	@PostMapping("/login")
	public String userlogin(@RequestBody Login ul) {
		return sr.userlogin(ul);
	}
	@PostMapping("/addmovies")
	public String addmovies(@RequestBody AddMovies am) {
		return sr.addmovies(am);
	}
	@GetMapping("/allmovies")
	public java.util.List<AddMovies> allmovies(){
		return sr.allmovies();	
	}
	
	@DeleteMapping(path = "/deletemovies/{id}")
	public java.util.List<AddMovies> detelemoviebyid(@PathVariable int id){
		return sr.detelemoviebyid(id);	
	}
	@PutMapping(path = "/updatebyid/{id}")
	public String updatebyid(@PathVariable  int id, @RequestBody AddMovies u) {
		return sr.updatebyid(u,id);
	}
	@GetMapping("/users")
	public List<Login> showallusers(){
		return sr.showallusers();
	}
	@DeleteMapping(path = "/deleteuserbyid/{id}")
	public java.util.List<Login> deleteuserbyid(@PathVariable int id){
		return sr.deteleuserbyid(id);	
	}
	
	@PostMapping("/addreview")
	public String addreview(@RequestBody Reviewpojo p) {
		return sr.addreview(p);
	}
	
	@GetMapping("/getallreviews")
	public List<Reviewpojo> getallusersreviews(){
		return sr.getallusersreviews();
		
	}
	@GetMapping("/getallcomments/{id}")
	public List<Reviewpojo> getallcomments(@PathVariable int id){
		return sr.getallcomments(id);
		
	}
	
	
}
