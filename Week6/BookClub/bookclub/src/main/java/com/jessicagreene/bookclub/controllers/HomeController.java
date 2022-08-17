package com.jessicagreene.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jessicagreene.bookclub.models.LoginUser;
import com.jessicagreene.bookclub.models.User;
import com.jessicagreene.bookclub.services.BookService;
import com.jessicagreene.bookclub.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String index(Model model) {
		//Bind empty User and LoginUser objects to the JSP to capture form input
		User newUser = new User();
		model.addAttribute("newUser", newUser);
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, 
							Model model, HttpSession session) {
		// Call a register method in the service to do some extra validations and create a new user!
		User user = userService.register(newUser, result);
		if(result.hasErrors()) {
            // Send in the empty LoginUser before re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        } else { //no errors
            // Log in user by storing their ID from the DB in session
        	session.setAttribute("userId", user.getId());
        }
    
        return "redirect:/dashboard";
	}

	
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
    					BindingResult result, Model model, HttpSession session) {
        
        User user = userService.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        } else {		//no errors
            // Log in user by storing their ID from the DB in session
        	session.setAttribute("userId", user.getId());
        }
        return "redirect:/dashboard";
    }
    
    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {
    	Long userId = (Long) session.getAttribute("userId");
    	if(userId == null) {
    		return "redirect:/";
    	} else {
			model.addAttribute("currentUser", userService.getUserById(userId));
			model.addAttribute("books", bookService.findAllBooks());
			return "dashboard.jsp";
    	}
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}
