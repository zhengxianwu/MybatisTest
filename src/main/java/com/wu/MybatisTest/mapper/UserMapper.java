package com.wu.MybatisTest.mapper;

import java.util.List;

import com.wu.MybatisTest.beans.User;

public interface UserMapper {
	
	public boolean insertUser(User u);
	
	public List<User> findAllUsers();
	
	
}
