
package com.training.SpringSecurity.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.training.SpringSecurity.entities.User;

@Repository
publicinterfaceUsersRepositoryextendsCrudRepository<User, Integer>{

	public Optional<User>findUserByName(String name); 
}
