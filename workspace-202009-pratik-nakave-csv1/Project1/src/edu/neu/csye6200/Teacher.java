/**
 * 
 */
package edu.neu.csye6200;

import java.util.List;

/**
 * @author pnakave
 *
 */
public class Teacher extends Person {
	
	private double hourlyWage;

	public Teacher(int id, String firstName, String lastName, String parentFirstName, String parentLastName, int age,
			double hourlyWage) {
		super(id, firstName, lastName, parentFirstName, parentLastName, age);
		this.hourlyWage = hourlyWage;
	}
	
	public Teacher() {
		super();
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	@Override
	public String toString() {
		return "" + getId() + "," + getFirstName() + "," + getLastName() + ","
				+ getParentFirstName() + "," + getParentLastName() + "," + getAge() + ","
				+ hourlyWage;
	}
	
	public static void demo() {
		Teacher teacher = new Teacher();
		String[] teacherArray = {"5,John,Markson,Timothy,Markson,65,100.0"};
		
		FileUtility.writeCSVFile("Teacher_csv.txt", teacherArray);
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tHourlyWage");
		for (String string : teacherArray) {
			System.out.println(string.split(",")[0]+"\t"+string.split(",")[1]+"\t"+string.split(",")[2]+"\t"+string.split(",")[3]+"\t"
					+string.split(",")[4]+"\t"+string.split(",")[5]+"\t"+string.split(",")[6]);
		}
		FileUtility<Teacher> fileUtility = new FileUtility<Teacher>(teacher);
		List<Teacher> teacherList = fileUtility.readCSVFile("Teacher_csv.txt");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tHourlyWage");
		for (Teacher teacherCSVStr : teacherList) {
			System.out.println(teacherCSVStr.getId()+"\t"+teacherCSVStr.getFirstName()+"\t"+teacherCSVStr.getLastName()+"\t"+
		teacherCSVStr.getParentFirstName()+"\t"+teacherCSVStr.getLastName()+"\t"+teacherCSVStr.getAge()+"\t"+teacherCSVStr.getHourlyWage()+"\t");
		}
	}
	

}
