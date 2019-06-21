package com.wu.MybatisTest;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wu.MybatisTest.beans.User;
import com.wu.MybatisTest.mapper.UserMapper;

/**
 * Hello world!
 *
 */
public class App {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void main(String[] args) {

		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper user = session.getMapper(UserMapper.class);
			
			
			boolean insertUser = user.insertUser(new User( "12", "123", 123));
			System.out.println(insertUser);
			
			
			List<User> findAllUsers = user.findAllUsers();
			for(User u : findAllUsers) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
