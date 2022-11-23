package com.MRS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MRS.Model.AddMovies;

@Repository
public interface Addmovierepo extends JpaRepository<AddMovies, Integer> {
	@Modifying
    @Query(value = "update addmovies set title=?,description=?,rating=?,url=? where id=?",nativeQuery = true)
	void update(String title, String description, int rating, String url,int id1);

}
