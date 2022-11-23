import { Component, OnInit } from '@angular/core';
import { Moviedetails } from '../Model/Moviedetails';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-viewdelete',
  templateUrl: './viewdelete.component.html',
  styleUrls: ['./viewdelete.component.css']
})
export class ViewdeleteComponent implements OnInit {

  constructor(private service :ServiceService) { }
data:any;
  ngOnInit(): void {
    
    
   let resp= this.service.viewallmovies();
   resp.subscribe((reply)=>this.data=reply)
   
  }

  deletebyid(d:number){
    let resp= this.service.deletemoviebyid(d);
  resp.subscribe((response)=>this.data=response);
  }
  d: number=-1;
edit(d:number){
this.d=d;
console.log(d);
}
updatedisplay:any;
updatemoviedetails(m:Moviedetails){
  let resp= this.service.updatemoviesbyid(this.d,m);
  resp.subscribe((response)=>this.updatedisplay=response);
  console.log(m)
  console.log(this.d)
}
}
