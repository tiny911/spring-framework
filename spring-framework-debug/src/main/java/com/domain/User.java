package com.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Value("zhaoxl")
	private String name;

	@Value("32")
	private  int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
