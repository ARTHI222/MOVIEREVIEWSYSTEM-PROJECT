import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { adminloginpojo } from '../Model/adminlogin';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }
  message:any;
  display:any;
  ngOnInit(): void {
  }
  
  admin(d:adminloginpojo){
    let resp=this.service.adminlogin(d);
    resp.subscribe((response)=>this.message=response)
  
  
  if(this.message==='Ok'){
    this.router.navigate(['adminoperations']);
  }
  if(this.message==='Email Id Not Found'){
    this.display=this.message;
  }
  if(this.message==='Invalid Login Details'){
    this.display=this.message;
  }
  }

}
