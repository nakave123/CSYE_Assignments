/**
 * 
 */
package edu.neu.csye6200;

import java.util.Collections;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class Student extends Person implements Comparable<Student>{

	private int studentId;
	private double gpa;
	
	public Student(int id, String firstName, String lastName, String parentFirstName, String parentLastName, int age,
			int studentId, double gpa) {
		super(id, firstName, lastName, parentFirstName, parentLastName, age);
		this.studentId = studentId;
		this.gpa = gpa;
	}
	
	public Student() {
		super();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public int compareTo(Student s1) {
		
		return Double.compare(this.getGpa(),s1.getGpa());
	}
	
	public static int compareByStudentId(Student o1, Student o2) {	
		return Integer.compare(o1.getStudentId(), o2.getStudentId());	
	}
	
	@Override
	public String toString() {
		return getId() + "," + getFirstName() + "," + getLastName() + ","
				+ getParentFirstName() + "," + getParentLastName() + "," + getAge() + ","
				+ studentId + "," + gpa;
	}

	public static void demo() {
		Student student = new Student();
		String[] stdentArray = {
				"11,Peter,Hanks,Kelab,Hanks,22,128,4.0",
				"29,Jenny,Smith,Klaus,Smith,66,101,3.0",
				"31,Tommy,Woods,Merry,Woods,88,174,2.0",
				"47,Dolly,Tahir,Harry,Tahir,38,136,2.5"
		}; 
		System.out.println("---------------Unsorted CSV record data---------------------");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA");
		for (String string : stdentArray) {
			System.out.println(string.split(",")[0]+"\t"+string.split(",")[1]+"\t"+string.split(",")[2]+"\t"+string.split(",")[3]+"\t"
					+string.split(",")[4]+"\t"+string.split(",")[5]+"\t"+string.split(",")[6]+"\t"+string.split(",")[7]);
		}
		
		FileUtility.writeCSVFile("Student_csv.txt", stdentArray);
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA\t");
		for (String string : stdentArray) {
			System.out.println(string.split(",")[0]+"\t"+string.split(",")[1]+"\t"+string.split(",")[2]+"\t"+string.split(",")[3]+"\t"
					+string.split(",")[4]+"\t"+string.split(",")[5]+"\t"+string.split(",")[6]+"\t"+string.split(",")[7]);
		}
		FileUtility<Student> fileUtility = new FileUtility<Student>(student);
		List<Student> studentList = fileUtility.readCSVFile("Student_csv.txt");
		
		//studentList.sort(Student::compareById);
		Collections.sort(studentList, student.new IdComparator<Student>());
		System.out.println("\n" + "---------------Sorted " + "studentList list by Id----------------");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA\t");
		for (Student csvStr : studentList) {
			System.out.println(csvStr.getId()+"\t"+csvStr.getFirstName()+"\t"+csvStr.getLastName()+"\t"+csvStr.getParentFirstName()+"\t"
					+csvStr.getParentLastName()+"\t"+csvStr.getAge()+"\t"+csvStr.getStudentId()+"\t"+csvStr.getGpa());
		}
		
		studentList.sort(Student::compareByStudentId);
		System.out.println("\n" + "---------------Sorted " + "studentList list by Student Id----------------");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA\t");
		for (Student csvStr : studentList) {
			System.out.println(csvStr.getId()+"\t"+csvStr.getFirstName()+"\t"+csvStr.getLastName()+"\t"+csvStr.getParentFirstName()+"\t"
					+csvStr.getParentLastName()+"\t"+csvStr.getAge()+"\t"+csvStr.getStudentId()+"\t"+csvStr.getGpa());
		}
		
		//studentList.sort(Student::compareByFirstName);
		Collections.sort(studentList, student.new FirstNameComparator<Student>());
		System.out.println("\n" + "---------------Sorted " + "studentList list by FirstName----------------");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA\t");
		for (Student csvStr : studentList) {
			System.out.println(csvStr.getId()+"\t"+csvStr.getFirstName()+"\t"+csvStr.getLastName()+"\t"+csvStr.getParentFirstName()+"\t"
					+csvStr.getParentLastName()+"\t"+csvStr.getAge()+"\t"+csvStr.getStudentId()+"\t"+csvStr.getGpa());
		}
		
		//studentList.sort(Student::compareByLastName);
		Collections.sort(studentList, student.new LastNameComparator<Student>());
		System.out.println("\n" + "---------------Sorted " + "studentList list by LastName----------------");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA\t");
		for (Student csvStr : studentList) {
			System.out.println(csvStr.getId()+"\t"+csvStr.getFirstName()+"\t"+csvStr.getLastName()+"\t"+csvStr.getParentFirstName()+"\t"
					+csvStr.getParentLastName()+"\t"+csvStr.getAge()+"\t"+csvStr.getStudentId()+"\t"+csvStr.getGpa());
		}
		
		studentList.sort(Student::compareTo);
		System.out.println("\n" + "---------------Sorted " + "studentList list by GPA----------------");
		System.out.println("ID\tFName\tLName\tPFName\tPLName\tAge\tStudId\tGPA\t");
		for (Student csvStr : studentList) {
			System.out.println(csvStr.getId()+"\t"+csvStr.getFirstName()+"\t"+csvStr.getLastName()+"\t"+csvStr.getParentFirstName()+"\t"
					+csvStr.getParentLastName()+"\t"+csvStr.getAge()+"\t"+csvStr.getStudentId()+"\t"+csvStr.getGpa());
		}
				
	}
	
	
}
