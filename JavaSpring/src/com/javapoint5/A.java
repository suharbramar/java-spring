package com.javapoint5;

public class A {
	B b; 
	
	A(){
		System.out.println("a is created");
	}
	
	public B getB() {
		return b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	public void print() {
		System.out.println("Hello A");
	}
	
	public void display() {
		print();
		b.print();
	}

}
