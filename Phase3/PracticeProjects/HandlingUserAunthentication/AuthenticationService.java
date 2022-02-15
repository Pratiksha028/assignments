            
package com.training.Authentication.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Authentication.entities.User;
import com.training.Authentication.exceptions.UserNotFoundException;
import com.training.Authentication.repositories.AuthenticationRepository;
@Service
public class AuthenticationService {
	@Autowired
	AuthenticationRepositoryauthRepo;
	public User GetUserByName(String name) {
		Optional<User> found = authRepo.findUserByName(name);
		if(found.isPresent()) return found.get();
		else throw new UserNotFoundException();
	}
public Boolean isValidPassword(String cmp, String actual) {
return ((cmp.equals(actual)) ?  true :  false);	
}
}

