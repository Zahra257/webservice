package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;






public interface IUserDao extends JpaRepository<User, Integer> {
	
	
	public User findByUsername(String username);

}
