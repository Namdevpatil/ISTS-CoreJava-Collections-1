package com.javaListCollections;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	private double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Student s1) {
		
		return this.name.compareTo(s1.getName());
	}

	/*
	 * @Override public int compareTo(Student s1) { if(this.rollNo ==
	 * s1.getRollNo()) { return 0; } else if(this.rollNo > s1.getRollNo()) { return
	 * +1; } else{ return -1; } }
	 */
	
	
	
	
}
