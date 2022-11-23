import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-showallusers',
  templateUrl: './showallusers.component.html',
  styleUrls: ['./showallusers.component.css']
})
export class ShowallusersComponent implements OnInit {

  constructor(private service:ServiceService) { }

  data:any;
  ngOnInit(): void {
    let resp =this.service.showallusers();
    resp.subscribe((reply)=>this.data=reply);
  }
  deleteuserbyid(d:Number){
    console.log(d);
    let resp =this.service.deleteuser(d);
    resp.subscribe((reply)=>this.data=reply);
  }

}
