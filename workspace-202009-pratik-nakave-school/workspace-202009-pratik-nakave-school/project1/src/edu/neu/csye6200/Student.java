/**
 * 
 */
package edu.neu.csye6200;

import java.util.Comparator;

/**
 * @author pnakave
 *
 */
public class Student extends Person implements Comparable<Student>{

	private double gpa;
	
	public Student(int id, String name, int age, double gpa) {
		super(id, name, age);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student s1) {
		
		return Double.compare(this.getGpa(),s1.getGpa());
	}

	@Override
	public String toString() {
		return "Student with id=" + getId() + " has name=" + getName() + " and age=" + getAge() + " scored GPA: " + gpa;
	}

	
}
