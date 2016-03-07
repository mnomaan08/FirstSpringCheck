package com.example.rest.check.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.rest.check.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int saveMessage(User user) {
		String userName = user.getUserName();
		String message = user.getMessage();
		String sql = "Insert into User_table(userName,message) values('"+userName+"' , '"+message+"')";
		jdbcTemplate.update(sql);
		return 0;
	}

}
