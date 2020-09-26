package com.sporty_shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty_shoes.model.User;
import com.sporty_shoes.repository.UserRepository;
import com.sporty_shoes.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository ; 

	@Override
	public User addUser(User user) {
		return userRepository.save(user) ; 
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user) ; 
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get() ; 
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll() ; 
	}

	@Override
	public List<User> getUserByFirstName(String firstname) {
		return userRepository.findByFirstname(firstname) ; 
	}

	@Override
	public List<User> getUserByLastName(String lastname) {
		return userRepository.findByLastname(lastname) ; 
	}

	@Override
	public List<User> getUserByAge(int age) {
		return userRepository.findByAge(age) ; 
	}

	@Override
	public List<User> getUserByEmail(String emailid) {
		return userRepository.findByEmailid(emailid) ; 
	}

}
