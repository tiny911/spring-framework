package com;

import com.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AppConfig.class);
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("person.xml");

		Person person = cac.getBean(Person.class);

		System.out.println( person.getName() + "--" + person.getAge());

	}
}
