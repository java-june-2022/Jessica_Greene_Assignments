package com.codingdojo.loginandregistration.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.loginandregistration.models.LoginUser;
import com.codingdojo.loginandregistration.models.User;
import com.codingdojo.loginandregistration.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//create and validations
	
	//This method will be called from the controller when a user submits a registration form
	public User register(User newUserData, BindingResult result) {
		
		User newUser = userRepository.findByEmail(newUserData.getEmail()).orElse(null);				//Search db for email in new user data
		if(newUser != null) {																		//If email already taken,
			result.rejectValue("email", "Taken",  "The Email is already taken!");					//assign error to result
		}
		String passwordEntered = newUserData.getPassword();
		if(!passwordEntered.equals(newUserData.getConfirm())) {										//If password does not match confirmation password,
			result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");  //assign error to result
		}


		
		if(result.hasErrors()) {																	//If result has errors
			return null;																			//Exit the method and go back to controller to hand response
		} else {																					//If no errors
			String hashedPassword = BCrypt.hashpw(newUserData.getPassword(), BCrypt.gensalt());		//hash password, 
			newUserData.setPassword(hashedPassword); 												//set password,
			return userRepository.save(newUserData);												//then save user to database
		}
	}

	//This method will be called from the controllers when a a user submits a login form
	public User login(LoginUser newLoginData, BindingResult result) {
		
		User user = userRepository.findByEmail(newLoginData.getEmail()).orElse(null);				//Find user in DB by email
		if(user == null) {																			//If user is not present
			result.rejectValue("email", "NotFound",  "Invalid email.");								//assign error to result
		} else {
		
			String passwordEntered = newLoginData.getPassword();
			if(!BCrypt.checkpw(passwordEntered, user.getPassword())) {								//If password entered does not match user's password
				result.rejectValue("password", "Matches", "Invalid password.");						//assign error to result
			}
		}
		
		if(result.hasErrors() ) {
			return null;																		//Exit the method and go back to controller to hand response
		} else {
			return userRepository.save(user);													//Otherwise, return the user object
	
		}
	}
	
	//read one
	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	//update
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	//delete
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
}
