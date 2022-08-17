package com.jessicagreene.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessicagreene.bookclub.models.Book;
import com.jessicagreene.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	// returns all the books
    public List<Book> findAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    // retrieves a book
    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    //updates a book
	public Book updateBook(Book book) {
        return bookRepository.save(book);
	}
	//deletes a book by id
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}
}
