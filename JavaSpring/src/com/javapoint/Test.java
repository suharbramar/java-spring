package com.javapoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use bean factory
//        Resource resource = new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        
		//use application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //better use application context than bean factory
         
        //Student student = (Student)factory.getBean("studentbean");
        Student student = (Student)context.getBean("studentbean");
        student.displayInfo();
	}

}
