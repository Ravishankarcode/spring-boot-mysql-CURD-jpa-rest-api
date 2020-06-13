package com.example.mysql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysql.model.User;


/**
 * 
 * @author Ravishankar.kumar
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{

	Optional<User> findByFirstname(String firstname);


}
