package com.javapoint5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext5.xml");
		A a = ctx.getBean("a",A.class);
		a.display();
		
	}

}
