package com.javapoint;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//EmployeeDao dao = (EmployeeDao)ctx.getBean("d");
			
			//jdbc template 
			//insert data employee
			//int status = dao.saveEmployee(new Employee(102,"Amit",35000));
		// TODO Auto-generated method stub
		
		Resource r=new ClassPathResource("applicationContext.xml");   
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
	        
	    Employee e=new Employee();   
	    e.setId(120);  
	    e.setName("Bram");   
	    e.setSalary(1000000);  
	      
	    dao.saveEmployee(e);      

	}   

}
