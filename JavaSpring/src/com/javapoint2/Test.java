package com.javapoint2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.*;


//Constructor Injection with dependency object
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Resource r = new ClassPathResource("applicationContext2.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee s = (Employee)factory.getBean("e");
		s.show();
	}

}
