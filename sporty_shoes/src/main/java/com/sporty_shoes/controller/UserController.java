package com.sporty_shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sporty_shoes.model.User;
import com.sporty_shoes.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService ;

	@PostMapping("/admin/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user) ; 
	}

	@PutMapping("/admin/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user) ; 
	}

	@DeleteMapping("/admin/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

	@GetMapping("/admin/user/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id) ; 
	}

	@GetMapping("/admin/users")
	public List<User> getAllUser() {
		return userService.getAllUser() ; 
	}

	@GetMapping("/admin/users/firstname/{firstname}")
	public List<User> getUserByFirstName(@PathVariable String firstname) {
		return userService.getUserByFirstName(firstname) ; 
	}

	@GetMapping("/admin/users/lastname/{lastname}")
	public List<User> getUserByLastName(@PathVariable String lastname) {
		return userService.getUserByLastName(lastname) ; 
	}

	@GetMapping("/admin/users/age/{age}")
	public List<User> getUserByAge(int age) {
		return userService.getUserByAge(age);
	}

	@GetMapping("/admin/users/emailid/{emailid}")
	public List<User> getUserByEmail(@PathVariable String emailid) {
		return userService.getUserByEmail(emailid) ; 
	} 
	
}
