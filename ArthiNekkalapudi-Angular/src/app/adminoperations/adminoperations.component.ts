import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminoperations',
  templateUrl: './adminoperations.component.html',
  styleUrls: ['./adminoperations.component.css']
})
export class AdminoperationsComponent implements OnInit {

  constructor(private router :Router) { }

  ngOnInit(): void {
  }
  Addmovies(){
    this.router.navigate(['addmovies'])
    console.log("add");

  }
  Viewdelete(){
this.router.navigate(['viewdelete'])
  }
  Showallusers(){
this.router.navigate(['showallusers'])
  }
}
