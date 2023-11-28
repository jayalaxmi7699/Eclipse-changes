package com.book.Service;

import java.awt.print.Book;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.daolayer.BookRepository;
import com.booksentity.Books;

@Service
public class BookService {
	
	
	@Autowired
    private BookRepository bookRepository;
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Books> getBooksByAuthorName(String firstName) {
        return bookRepository.findByAuthor_FirstName(firstName);
    }

    public List<Books> getBooksInPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return bookRepository.findByPriceBetween(minPrice, maxPrice);
    }

    public String getAuthorNameForBookId(Long bookId) {
        return bookRepository.findAuthor_FirstNameByBookId(bookId);
    }

}
