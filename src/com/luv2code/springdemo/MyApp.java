package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object
		ICoach coach = new TrackCoach();
		
		// use object
		System.out.println(coach.getDailyWorkout());
	}

}
