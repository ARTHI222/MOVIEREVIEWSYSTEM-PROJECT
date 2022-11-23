import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { FormsModule } from '@angular/forms';
import { ServiceService } from './service.service';
import { HttpClientModule } from '@angular/common/http';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminoperationsComponent } from './adminoperations/adminoperations.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { LoginComponent } from './login/login.component';
import { AddmoviesComponent } from './addmovies/addmovies.component';
import { ViewdeleteComponent } from './viewdelete/viewdelete.component';
import { ShowallusersComponent } from './showallusers/showallusers.component';
import { HomechildComponent } from './homechild/homechild.component';
import { CactivateGuard } from './cactivate.guard';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminComponent,
    AboutusComponent,
    AdminoperationsComponent,
    UserregisterComponent,
    LoginComponent,
    AddmoviesComponent,
    ViewdeleteComponent,
    ShowallusersComponent,
    HomechildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule
  ],
  providers: [ServiceService,CactivateGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
