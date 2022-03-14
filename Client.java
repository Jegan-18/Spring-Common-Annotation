package com.cg.college;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Client {

	public static void main(String[] args) {
		
    
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    System.out.println("beans.xml is loaded");
	    College college = context.getBean("collegeBean", College.class);
	    System.out.println("College obj creacted" + college);
	    
	   
	}

}
