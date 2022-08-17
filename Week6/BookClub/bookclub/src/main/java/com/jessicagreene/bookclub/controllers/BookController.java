package com.jessicagreene.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jessicagreene.bookclub.models.Book;
import com.jessicagreene.bookclub.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	//Create
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("userId", userId);
		return "/books/new.jsp";
	}
	
	@PostMapping("/books/create")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "/books/new.jsp";
		}
		bookService.createBook(book);
		return "redirect:/dashboard";
	}

	//Read
	@GetMapping("books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookService.findBookById(id));
		return "books/show.jsp";
	}
	
	//Update
	@GetMapping("books/{id}/edit")
	public String editBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookService.findBookById(id));
		//bookInfo holds the existing information from the database to populate the value fields
		model.addAttribute("bookInfo", bookService.findBookById(id));
		return "books/edit.jsp";
	}
	
	@PutMapping("/books/{id}")
	public String updateBook(@PathVariable("id") Long id,
							@Valid @ModelAttribute("book") Book book, BindingResult result,
							Model model) {
		if(result.hasErrors()) {
			//bookInfo holds the existing information from the database to populate the value fields
			model.addAttribute("bookInfo", bookService.findBookById(id));
			return "books/edit.jsp";
		}
		return "redirect:/books/{id}";
	}
}
