import { Component, OnInit } from '@angular/core';
import { adminloginpojo } from '../Model/adminlogin';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class UserregisterComponent implements OnInit {

  m:any;

  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }
  
  register(d:adminloginpojo){
   let resp=this.service.resgiter(d);
   resp.subscribe((response)=>this.m=response);
  }

}
