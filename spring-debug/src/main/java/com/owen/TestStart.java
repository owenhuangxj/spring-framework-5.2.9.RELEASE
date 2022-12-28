package com.owen;

import com.owen.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author OwenHuang
 * @since 2022/12/28 21:39
 */
public class TestStart {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		User user = (User) context.getBean("user");
		System.out.println("user:" + user);
	}
}
