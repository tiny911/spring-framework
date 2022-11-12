package com.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class StudentFactoryBean implements FactoryBean<Student> {
	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		return student;
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
