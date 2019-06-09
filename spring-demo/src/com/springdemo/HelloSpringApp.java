package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container.
		Coach TheCoach = context.getBean("myCoach",Coach.class);
		
		// call method on bean.
		
		System.out.println(TheCoach.gerDailyWorkout());
		
		
	}

}
