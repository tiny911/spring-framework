package com;

import com.config.AppConfig;
import com.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = acc.getBean(User.class);

		System.out.println( user.getName() + "--" + user.getAge());

	}
}
