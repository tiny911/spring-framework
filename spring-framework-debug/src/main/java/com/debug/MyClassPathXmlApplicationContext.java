package com.debug;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	MyClassPathXmlApplicationContext(String ... locations){
		super(locations);
	}

	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory){
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
	}
}
