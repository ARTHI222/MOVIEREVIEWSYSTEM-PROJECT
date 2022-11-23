import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Moviedetails } from '../Model/Moviedetails';
import { reviewdata } from '../Model/Review';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-homechild',
  templateUrl: './homechild.component.html',
  styleUrls: ['./homechild.component.css']
})
export class HomechildComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }

  data:any;
  comments:any;
  ngOnInit(): void {
     
   let resp= this.service.viewallmovies();
   resp.subscribe((reply)=>this.data=reply)

   let r=this.service.getallreviews();
   r.subscribe((response)=>this.comments=response)
  }
  val:any;
  title:any;
  id:any;
  email:any;

  Addreview(val:any){
if(localStorage.getItem("email")==null){
this.router.navigate(['login']);
alert("Login First");
}
else{
    this.email=localStorage.getItem("email");
 this.val=val;
 this.title=val.title;
 this.id=val.id;
}
 
  }
  reviews:any;
  viewreview(d:any){
    
    let id=d.id;
  let resp=this.service.getallcomments(id);
  resp.subscribe((response)=>this.reviews=response)
  console.log(this.reviews)

  }
  reviewmessage:any;
  AddReviewdata(d:reviewdata){
    let email:String=this.email;
    let id:number=this.id;
    d.email=email;
    d.id=id;
   let resp=this.service.addreview(d);
   resp.subscribe((reply)=>this.reviewmessage=reply)

  }

}
