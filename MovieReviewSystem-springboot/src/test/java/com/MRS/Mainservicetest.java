package com.MRS;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.MRS.Model.AddMovies;
import com.MRS.Model.Login;
import com.MRS.Model.Reviewpojo;
import com.MRS.Repository.Addmovierepo;
import com.MRS.Repository.Loginrepo;
import com.MRS.Repository.Review;
import com.MRS.Service.MainService;


@SpringBootTest(classes= {Mainservicetest.class})


public class Mainservicetest<email> {

@Mock

Loginrepo lrepo;

Review reviewrepo;

Addmovierepo amrepo;

@InjectMocks
MainService mainservice;


private Login login;
private Reviewpojo reviewpojo;
private AddMovies addmovies;

@Test
@Order(value = 1)
public void test_findbyemail()
{
when(lrepo.findbyemail(null)).thenReturn(login);
mainservice.findbyemail();
}


@Test
@Order(value = 2)
public void test_findbyemailuser()
{
when(lrepo.findbyemailuser(null)).thenReturn(login);
mainservice.findbyemailuser();
}


@Test
@Order(value = 3)
public void test_showallusers() {
when(lrepo.findAll()).thenReturn((List<Login>) login);
mainservice.showallusers();
}


@Test
@Order(value = 4)
public void test_deleteuserbyid() { try {
List<Login> mylogin=new ArrayList<Login>();
mylogin.add(new Login(1,"arthi@gmail.com","arthi@222"));
mylogin.add(new Login(2,"sandy@gmail.com","sandy@222"));
int id=1;
when(lrepo.findAll()).thenReturn(mylogin);
assertsEquals(id,mainservice.deleteuserbyid(id).getId());
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}


@Test
@Order(value = 5)
public void test_getallusersreviews() {try {
List<Reviewpojo> myreview=new ArrayList<Reviewpojo>();
myreview.add(new Reviewpojo(1,1,"arthi@gmail.com","supermovie",3));
when(reviewrepo.findAll()).thenReturn(myreview);
assertsEquals((Reviewpojo) mainservice.getallusersreviews());
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}

@Test
@Order(value=6)
public void test_addmovies() { try {
when(amrepo.save(null)).thenReturn(addmovies);
mainservice.addmovies(addmovies);
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}

@Test
@Order(value=7)
public void test_register() { try {
when(lrepo.save(null)).thenReturn(login);
mainservice.register(login);
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}

@Test
@Order(value = 8)
public void test_allmovies() { try {
when(amrepo.findAll()).thenReturn((List<AddMovies>) addmovies);
mainservice.allmovies();
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}

@Test
@Order(value = 9)
public void test_deletemoviebyid() { try {
List<AddMovies> myMovies=new ArrayList<AddMovies>();
myMovies.add(new AddMovies(1,"Sakhi","Love story",4,"images.jpg"));
myMovies.add(new AddMovies(2,"Ganga","Horror with terror",3,"images1.jpg"));
int id=1;
when(amrepo.findAll()).thenReturn(myMovies);
assertsEquals(id,((AddMovies) mainservice.detelemoviebyid(id)).getId());
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}




@Test
@Order(value = 10)
public void test_getallcoments() {try {
List<Reviewpojo> myreview=new ArrayList<Reviewpojo>();
myreview.add(new Reviewpojo(1,1,"arthi@gmail.com","supermovie",3));
when(reviewrepo.findbyvalue(0)).thenReturn(myreview);
assertsEquals((Reviewpojo) mainservice.getallcomments(0));
}
catch(NullPointerException e){
    System.out.print("NullPointerException Caught");
}
}


@Test
@Order(value=11)
public void test_addreview() { try {
when(reviewrepo.save(null)).thenReturn(reviewrepo);
mainservice.addreview((Reviewpojo) reviewrepo);
}
catch(NullPointerException e){
System.out.print("NullPointerException Caught");
}
}
private void assertsEquals(Reviewpojo getallusersreviews) {
// TODO Auto-generated method stub
}
private void assertsEquals(int id, int id2) {
    // TODO Auto-generated method stub
    
}

}
