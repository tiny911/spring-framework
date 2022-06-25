package com.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class StudentFactoryBean implements FactoryBean<Student> {
	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		/*Object o = Proxy.newProxyInstance(Student.class.getClassLoader(), Student.class.getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				return null;
			}
		});*/
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
