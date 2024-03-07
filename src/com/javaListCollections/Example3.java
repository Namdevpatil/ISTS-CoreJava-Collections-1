package com.javaListCollections;

import java.util.ArrayList;
import java.util.List;

//List: ArrayList
public class Example3 {

	public static void main(String[] args) 
	{
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101, "Sunitha", 50));
		students.add(new Student(223, "Janaki", 80));
		students.add(new Student(112, "Lalitha", 56));
		students.add(new Student(334, "Sushma", 90));
		//students.add(new Product());
		
		for(Student student: students)
		{
			System.out.println(student.getRollNo()+" | "+student.getName()+" | "+student.getMarks());
		}
		
	}

}
