package com.book.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.Service.BookService;
import com.booksentity.Books;

@RestController
public class BookController {
	
	@Autowired
    private BookService bookService;
	
	@GetMapping("/byAuthor/{firstName}")
    public List<Books> getBooksByAuthorName(@PathVariable String firstName) {
        return bookService.getBooksByAuthorName(firstName);
    }

    @GetMapping("/byPriceRange")
    public List<Books> getBooksInPriceRange(
            @RequestParam BigDecimal minPrice,
            @RequestParam BigDecimal maxPrice) {
        return bookService.getBooksInPriceRange(minPrice, maxPrice);
    }

    @GetMapping("/authorNameForBook/{bookId}")
    public String getAuthorNameForBookId(@PathVariable Long bookId) {
        return bookService.getAuthorNameForBookId(bookId);
    }
}
