
	package com.training.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.training.Authentication.controllers.AuthenticationController; 
AuthenticationController.class,

importcom.training.Authentication.entities.User;
importcom.training.Authentication.exceptions.UserNotFoundException;
importcom.training.Authentication.services.AuthenticationService;

@SpringBootApplication
@Import({
UserNotFoundException.class,
AuthenticationService.class,
User.class
})
publicclassAuthenticationApplication {

publicstaticvoid main(String[] args) {
SpringApplication.run(AuthenticationApplication.class, args);
   }

}
