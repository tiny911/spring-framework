package com;

import com.domain.Person;
import com.domain.Student;
import com.domain.StudentFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AppConfig.class);
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("person.xml");

		Person person = cac.getBean(Person.class);

		Object student = cac.getBean("studentFactoryBean");
		StudentFactoryBean studentFactoryBean = (StudentFactoryBean)cac.getBean("&studentFactoryBean");

		System.out.println(student.getClass().getName());
		System.out.println(studentFactoryBean.getClass().getName());

		System.out.println( person.getName() + "--" + person.getAge());

	}
}
