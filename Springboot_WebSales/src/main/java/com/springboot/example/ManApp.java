package com.springboot.example;

public class ManApp {
	public static void main(String[] args) {

		InstructorDao instructorDao = new InstructorDao();
		
		Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com");
		instructorDao.saveInstructor(instructor);
		
		// create some courses
		Course tempCourse1 = new Course("Learn Spring Boot");
	    instructor.getCourses().add(tempCourse1);
		
		Course tempCourse2 = new Course("Learn hibernate");
	    instructor.getCourses().add(tempCourse2);
		
		instructorDao.saveInstructor(instructor);
	}
}
