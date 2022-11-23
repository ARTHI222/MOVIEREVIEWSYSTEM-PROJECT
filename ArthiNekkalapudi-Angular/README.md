# MovieReviewSystem

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.2.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Instructions
1) Instruction
Goto My sql create a new user and grant all the privileges to that user
create user username identified by password;
eg;-
step 1:->
create user 'Arthi' identified by 'Arthi@22';
step 2:->
grant  all privileges on Star.Star to username;
eg:->
grant all privilege on Star.Star to 'Arthi';
step 3:->
eg:-> 
system mysql -u Arthi -p ;
password:Arthi@222

2)Instruction

1)Create  database MovieReviewSystem;
2)use MovieReviewSystem;
3)Create table admin (id int primary key,email varchar(25),password varchar(25));
4)INSERT INTO admin VALUES (1,"aarthi@gmail.com","Arthi@222");

3)Instruction 
In spring boot code open src/resources and then Application.properties

server.port=8080

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/MovieReviewSystem;  //database name
spring.datasource.username=Arthi
spring.datasource.password=Arthi@222
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect

4)Run Both Angular and SpringBoot project
5)login as admin and add Movie details Use Imdb images url to add in url 
  ADD below Details
  1)Harry Potter - >   image url :->   https://m.media-amazon.com/images/M/MV5BZjZlZDBkYzgtY2VmNi00OWI3LTk3ZjktZTk1MTliYWMxMWQxXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_.jpg
  2)Avengers ->  image url :->     https://m.mediaamazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX1000_.jpg
  3)Spiderman -> Imageurl :-> https://m.media-amazon.com/images/M/MV5BODEwNjFhOWUtZGYwNy00M2I4LWI5ZDYtNTExNjE2NzFlYTViXkEyXkFqcGdeQXVyMTYzMDM0NTU@._V1_.jpg
  4)Iron Man-> Image url :->  https://m.media-amazon.com/images/M/MV5BMjE5MzcyNjk1M15BMl5BanBnXkFtZTcwMjQ4MjcxOQ@@._V1_.jpg
  5)Black Adam -> Image Url:-> https://m.media-amazon.com/images/M/MV5BMTAxNDBjMTUtMzEzNi00ZWNkLTg4MmQtMTA2MDg2YjQwZjVhXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_.jpg
  6)Avatar-> Imge url->https://m.media-amazon.com/images/M/MV5BNjA3NGExZDktNDlhZC00NjYyLTgwNmUtZWUzMDYwMTZjZWUyXkEyXkFqcGdeQXVyMTU1MDM3NDk0._V1_FMjpg_UX1000_.jpg
  .......
 6) Register as user and perform the operations like adding reviews only loggedin users can able to add Reviews
 
  
  





