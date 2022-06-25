package com.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person  implements BeanFactoryAware,ApplicationContextAware, InitializingBean {

	private String name;

	private String age;

	private BeanFactory beanFactory;
	private ApplicationContext applicationContext;

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	//问题：这个方法是在什么时候，谁来调用的？
	//容器调用的
	//容器怎么知道什么时候调用了？ 为了解决这个问题，定义了统一的规范接口，然后实现此功能：Aware 接口
	//BeanFactoryAware implement Aware 接口，定义了setBeanFactory(BeanFactory beanFactory)
	//ApplicationContextAware implement Aware接口,定义了setApplicationContext(ApplicationContext applicationContext);
	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	//给用户最后一次机会，可以干预bean 属性的设置
	@Override
	public void afterPropertiesSet() throws Exception {
		this.name ="zhangsan";
	}
}
