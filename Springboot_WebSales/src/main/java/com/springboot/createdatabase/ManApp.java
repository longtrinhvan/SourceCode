package com.springboot.createdatabase;

public class ManApp {
	public static void main(String[] args) {

		CourseDao courseDao = new CourseDao();
		
//		Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com");
//		instructorDao.saveInstructor(instructor);
		
		// create some courses
		Course tempCourse1 = new Course("Learn Spring Boot");
		courseDao.saveCourse(tempCourse1);
//	    instructor.getCourses().add(tempCourse1);
//		
//		Course tempCourse2 = new Course("Learn hibernate");
//	    instructor.getCourses().add(tempCourse2);
//		
//		instructorDao.saveInstructor(instructor);
	}
}
