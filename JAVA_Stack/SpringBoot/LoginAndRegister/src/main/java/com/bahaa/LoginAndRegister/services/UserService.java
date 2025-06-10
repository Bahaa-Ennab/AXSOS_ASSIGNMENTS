package com.bahaa.LoginAndRegister.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.bahaa.LoginAndRegister.models.LoginUser;
import com.bahaa.LoginAndRegister.models.User;
import com.bahaa.LoginAndRegister.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public User register(User user, BindingResult bindingResult) {
		// Check if email is already taken
		Optional<User> potentialNewUser = userRepo.findByUserName(user.getUserName());
		if (potentialNewUser.isPresent()) {
			bindingResult.rejectValue("userName", "Email.Exsists", "This Username already exists!");
		}

		// Check if passwords match
		if (!user.getPassword().equals(user.getConfirm())) {
			bindingResult.rejectValue("password", "Not.Match", "Passwords not match!");
		}

		// Return null if result has errors
		if (bindingResult.hasErrors()) {
			return null;
		}

		// Hash and set password, save user to database
		String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashedPassword);
		return userRepo.save(user);

	}

	public User Login(LoginUser userLogin, BindingResult bindingResult) {

		// Find user in the DB by email
		Optional<User> loginUser = userRepo.findByEmail(userLogin.getEmail());
		if (loginUser.isEmpty()) {
			bindingResult.rejectValue("email", "Not Found", "email does not exist");
			return null;
		}

		// Get the user object
		User user = loginUser.get();

		// Reject if BCrypt password match fails
		if (!BCrypt.checkpw(userLogin.getPassword(), user.getPassword())) {
			bindingResult.rejectValue("password", "invalid", "email or Password does not exist");
		}

		// Return null if result has errors
		if (bindingResult.hasErrors()) {
			return null;
		} else {
			return user;
		}
	}
	public Optional<User> findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
}
