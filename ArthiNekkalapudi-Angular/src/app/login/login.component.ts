import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { adminloginpojo } from '../Model/adminlogin';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  message:any;
  display:any;

  // if(localStorage.getItem("email"))
  isLoggedIn = true;

  constructor(private service:ServiceService,private router:Router) { }

  ngOnInit(): void {
  }
  userlogin(l:adminloginpojo){

    var evalue:String=l.email;
    var epassword:String=l.password;
    console.log(l);
 let resp=this.service.userlogin(l);

 resp.subscribe((data)=>this.message=data)
 if(localStorage.getItem("email"))
 console.log(localStorage.getItem("email"))
 

 if(this.message==='Ok'){
  localStorage.setItem("password",""+epassword);
   localStorage.setItem("email",""+evalue);
  this.router.navigate(['home']);
}
if(this.message==='Email Id Not Found'){
  this.display=this.message;
}
if(this.message==='Invalid Login Details'){
  this.display=this.message;
}
  }

  Register(){

    this.router.navigate(['register']);
  }

}
