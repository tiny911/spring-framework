package com.circle;

public class B {
	public B(){}
	public B(A a){
		this.a = a;
	}

	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
