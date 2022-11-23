import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { adminloginpojo } from './Model/adminlogin';
import { Moviedetails } from './Model/Moviedetails';
import { reviewdata } from './Model/Review';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  
  
   constructor(private http:HttpClient) { }

  userlogin(l: adminloginpojo) {
   
     return this.http.post("http://localhost:8080/login",l,{responseType : 'text' as 'json'})
  }
  adminlogin(d: adminloginpojo) {
  return this.http.post("http://localhost:8080/adminlogin",d,{responseType:'text' as 'json'})
  }
  resgiter(d: adminloginpojo) {
   return this.http.post("http://localhost:8080/register",d,{responseType:'text' as 'json'})
  }
  addmovies(m: Moviedetails) {
  return this.http.post("http://localhost:8080/addmovies",m,{responseType:'text' as 'json'})
  }
  viewallmovies() {
    return this.http.get("http://localhost:8080/allmovies")
  }
  deletemoviebyid(d: number) {
    return this.http.delete("http://localhost:8080/deletemovies/"+d);
  } 
  updatemoviesbyid(d: number, m: Moviedetails) {
    return this.http.put("http://localhost:8080/updatebyid/"+d,m,{responseType:'text' as 'json'});    
  }
  showallusers() {
    return this.http.get("http://localhost:8080/users")
  }
  deleteuser(d: Number) {
    console.log("delete in service"+d)
    return this.http.delete("http://localhost:8080/deleteuserbyid/"+d)
  }

  addreview(d: reviewdata) {
    return this.http.post("http://localhost:8080/addreview",d,{responseType : 'text' as 'json'})
  }
  getallreviews() {
   return this.http.get("http://localhost:8080/getallreviews")
  }
  getallcomments(d: number) {
    return this.http.get("http://localhost:8080/getallcomments/"+d)
  }

}
