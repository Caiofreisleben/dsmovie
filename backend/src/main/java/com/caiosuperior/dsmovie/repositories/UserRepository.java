package com.caiosuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiosuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
