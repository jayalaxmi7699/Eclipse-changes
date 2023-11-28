package com.book.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booksentity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
	
	

}
