package com.debug.circle;

public class A {
	public A(){}
	public A(B b){
		this.b =b;
	}
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
