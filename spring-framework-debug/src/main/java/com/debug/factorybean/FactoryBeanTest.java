package com.debug.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");

		Student student = (Student)ac.getBean("studentFactoryBean");
		System.out.println(student);

		StudentFactoryBean studentFactoryBean = (StudentFactoryBean)ac.getBean("&studentFactoryBean");

		System.out.println(studentFactoryBean);


	}
}
