package com.book.daolayer;

import java.awt.print.Book;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.booksentity.Books;

public interface BookRepository  extends JpaRepository<Books, Long>{
	List<Books> findAll();
	
	// Query all books written by given author name
	List<Books> findByAuthor_FirstName(String firstName);
	
	//List all books with given price range:
    List<Books> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
    
    //. List the author name for given book id
    String findAuthor_FirstNameByBookId(@Param("bookId") Long bookId);

	Book save(Book book);

}
