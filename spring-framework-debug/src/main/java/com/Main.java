package com;

import com.config.AppConfig;
import com.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AppConfig.class);
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("");
		User user = acc.getBean(User.class);

		System.out.println( user.getName() + "--" + user.getAge());

	}
}
