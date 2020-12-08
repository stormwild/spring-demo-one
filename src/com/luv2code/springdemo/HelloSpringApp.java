package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from sprint container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}

}
