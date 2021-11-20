/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Student extends Person implements Comparable<Student>{
	
	double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int age, String firstName, String lastName,double gpa) {
		super(id, age, firstName, lastName);
		this.gpa = gpa;
		// TODO Auto-generated constructor stub
	}

	public Student(String csvString) {
		parseCSV(csvString);
	}

	private void parseCSV(String csvString) {
		// TODO Auto-generated method stub
		String[] tokens = csvString.split(",");
		int id = 0;
		try {
			id = Integer.parseInt(tokens[0]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("'"+tokens[0]+"' is not a valid");
			e.printStackTrace();
		}
		int age = 0;
		try {
			age = Integer.parseInt(tokens[1]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("'"+tokens[1]+"' is not a valid");
			e.printStackTrace();
		}
		this.setId(id);
		this.setAge(age);
		this.setFirstName(tokens[2]);
		this.setLastName(tokens[3]);
		double gpa = 0.0;
		try {
			gpa = Double.parseDouble(tokens[4]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("'"+tokens[4]+"' is not a valid");
			e.printStackTrace();
		}
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student with Id= " + getId() + " FirstName= " + getFirstName() + " LastName= " + getLastName()
				+ " Age= " + getAge()+ " and GPA= " + getGpa();
	}
	
	@Override
	public void show() {
		toString();
	}

	/*
	 * Implementing comparable for natural ordering sort
	 */
	@Override
	public int compareTo(Student arg0) {
		return Double.compare(this.getGpa(), arg0.getGpa());
	}
}
