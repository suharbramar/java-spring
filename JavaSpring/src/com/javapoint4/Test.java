package com.javapoint4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;


//setter injection
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("applicationContext4.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee e = (Employee)factory.getBean("e1");
		e.display();

	}

}
