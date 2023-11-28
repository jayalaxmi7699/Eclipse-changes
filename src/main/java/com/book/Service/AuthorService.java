package com.book.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.daolayer.AuthorRepository;
import com.booksentity.Author;
@Service
@Transactional
public class AuthorService {
	
	
	    @Autowired
	    private AuthorRepository authorRepository;

	    public Author saveAuthor(Author author) {
	        return authorRepository.save(author);
	    }

	    public List<Author> getAllAuthors() {
	        return authorRepository.findAll();
	    }

	    public Optional<Author> getAuthorById(Long authorId) {
	        return authorRepository.findById(authorId);
	    }

	    public void deleteAuthor(Long authorId) {
	        authorRepository.deleteById(authorId);
	    }


}
