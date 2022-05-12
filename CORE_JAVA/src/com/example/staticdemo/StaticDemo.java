package com.example.staticdemo;

public class StaticDemo {

	public static void main(String[] args) {

		Student john = new Student("john", 25, "23 East, California");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		
		System.out.println(Student.college);//correct way to calling a static variable. 
		
//		Student john1 = new Student("john", 25, "23 East, California");
//		Student john2 = new Student("john", 25, "23 East, California");
//		Student john3 = new Student("john", 25, "23 East, California");
//		Student john4 = new Student("john", 25, "23 East, California");
		
		
	}

}
