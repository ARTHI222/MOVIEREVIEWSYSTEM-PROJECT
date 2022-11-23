import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddmoviesComponent } from './addmovies/addmovies.component';
import { AdminComponent } from './admin/admin.component';
import { AdminoperationsComponent } from './adminoperations/adminoperations.component';
import { CactivateGuard } from './cactivate.guard';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ShowallusersComponent } from './showallusers/showallusers.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { ViewdeleteComponent } from './viewdelete/viewdelete.component';

const routes: Routes = [
  
  {path:"home",component:HomeComponent},{path:"",component:HomeComponent}
  ,{path:"admin",component:AdminComponent},{path:"adminoperations",component:AdminoperationsComponent},
  {path:"register",component:UserregisterComponent},{path:"login",component:LoginComponent},
  {path:"addmovies",component:AddmoviesComponent},{path:"viewdelete",component:ViewdeleteComponent},
  {path:"showallusers",component:ShowallusersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
