
package com.training.SpringSecurity.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.SpringSecurity.entities.MyUserDetails;
import com.training.SpringSecurity.entities.User;
import com.training.SpringSecurity.repositories.UsersRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UsersRepositoryuserRepo;
	public User GetUserByName(String name) {
		Optional<User> user = userRepo.findUserByName(name);
		if(!user.isPresent()) throw new RuntimeException();
		returnuser.get();
	}
	@Override
publicorg.springframework.security.core.userdetails.UserDetailsloadUserByUsername(String username)
			throwsUsernameNotFoundException {
		return new MyUserDetails(GetUserByName(username));
	}
}
