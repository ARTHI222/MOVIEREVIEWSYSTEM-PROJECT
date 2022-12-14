import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  isLoggedIn = !!localStorage.getItem("email");
  email=localStorage.getItem("email");
  constructor(private router:Router) {

  }

  ngOnInit(): void {
  }
logout(){
   localStorage.removeItem("email");
   localStorage.removeItem("password");
   this.router.navigate(['login']);
}
}
