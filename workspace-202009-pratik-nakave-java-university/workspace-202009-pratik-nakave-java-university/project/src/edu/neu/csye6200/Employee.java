/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Employee extends Person implements Comparable<Employee>{
	
	double wage;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, int age, String firstName, String lastName, double wage) {
		super(id, age, firstName, lastName);
		this.wage = wage;
		// TODO Auto-generated constructor stub
	}

	public Employee(String csvString) {
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
		double wage = 0.0;
		try {
			wage = Double.parseDouble(tokens[4]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("'"+tokens[4]+"' is not a valid");
			e.printStackTrace();
		}
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "Employee with Id= " + getId() + " FirstName= " + getFirstName() + " LastName= "
				+ getLastName() + " Age= " + getAge()+ " and Wage= " + getWage();
	}
	
	@Override
	public void show() {
		toString();
	}

	/*
	 * Implementing comparable for natural ordering sort
	 */
	@Override
	public int compareTo(Employee arg0) {
		return Double.compare(this.getWage(), arg0.getWage());
	}

}
