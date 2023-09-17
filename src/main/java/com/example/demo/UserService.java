package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UserService implements IuserService {
	
	@Autowired
	IUserDao userDao;
	
	public User chercherparUsername(String username)
	{
		return userDao.findByUsername(username);
	}

}
