import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MovieReviewSystem';
  //console.log(localStorage.getItem("email"));
  isLoggedIn = !!localStorage.getItem("email");
}

