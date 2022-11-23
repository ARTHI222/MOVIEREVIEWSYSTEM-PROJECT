import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Moviedetails } from '../Model/Moviedetails';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {

  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit(): void {
  }
  Goback(){
this.router.navigate(['adminoperations']);
  }
  display:any;
  moviedetails(m:Moviedetails){
console.log(m)
let resp=this.service.addmovies(m);
resp.subscribe((reply)=>this.display=reply);
  }

}
