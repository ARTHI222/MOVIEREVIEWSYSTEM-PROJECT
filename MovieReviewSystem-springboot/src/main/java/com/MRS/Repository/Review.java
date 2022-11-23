package com.MRS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MRS.Model.Reviewpojo;

@Repository
public interface Review extends JpaRepository<Reviewpojo, Integer>{

	@Query(value = "select * from reviewpojo where id=?",nativeQuery = true)
	List<Reviewpojo> findbyvalue(int id);

}

