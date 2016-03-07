package com.example.rest.check.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.check.dao.UserDao;
import com.example.rest.check.dao.UserDaoImpl;
import com.example.rest.check.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public int saveMessage(User user) {
		userDao.saveMessage(user);
		return 0;
	}

}
