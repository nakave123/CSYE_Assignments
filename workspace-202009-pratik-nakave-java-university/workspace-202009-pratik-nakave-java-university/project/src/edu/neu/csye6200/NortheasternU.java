/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class NortheasternU extends UniversityBase {

	//private List<AbstractPersonAPI> studentList = new ArrayList<AbstractPersonAPI>();
	//private List<AbstractPersonAPI> employeeList = new ArrayList<AbstractPersonAPI>();
	
	private List<AbstractPersonAPI> list = new ArrayList<AbstractPersonAPI>();
	
	public void addToList(List<AbstractPersonAPI> l) {
		list.addAll(l);
	}
	
	/*
	 * public void addToStudentList(AbstractPersonAPI o) { studentList.add(o); }
	 * 
	 * public void addToEmployeeList(AbstractPersonAPI o) { employeeList.add(o); }
	 */
	
	public static void demo() {
		//UniversityBase universityBase = new NortheasternU();
		NortheasternU northeasternU = new NortheasternU();
		
		Student S1 = new Student("25,51,I,U,3.2");									//Object instantiation by constructor
		northeasternU.addStudent(S1);
		//northeasternU.addToStudentList(S1);
		//northeasternU.addToList(S1);
		Student S2 = new Student("15,78,V,C,2.6");
		northeasternU.addStudent(S2);
		//northeasternU.addToStudentList(S2);
		//northeasternU.addToList(S2);
		
		northeasternU.addStudent(StudentFactory.getInstance().getObject());		//Object instantiation by singleton
		//northeasternU.addToStudentList(StudentFactory.getInstance().getObject());
		//northeasternU.addToList(StudentFactory.getInstance().getObject());
		northeasternU.addToList(northeasternU.studentRoster);
		
		System.out.println("-------------------Showing student list-------------------");
		northeasternU.showStudents();
		
		Employee E1 = new Employee("47,27,E,R,70");
		northeasternU.addEmployee(E1);
		//northeasternU.addToEmployeeList(E1);
		//northeasternU.addToList(E1);
		Employee E2 = new Employee("37,49,T,G,90");
		northeasternU.addEmployee(E2);
		//northeasternU.addToList(E2);
		//northeasternU.addToEmployeeList(E1);
		
		northeasternU.addEmployee(EmployeeFactory.getInsance().getObject());	//Object instantiation by singleton
		//northeasternU.addToEmployeeList(EmployeeFactory.getInsance().getObject());
		//northeasternU.addToList(EmployeeFactory.getInsance().getObject());
		northeasternU.addToList(northeasternU.employeeRoster);
		
		System.out.println("\n-------------------Showing employee list-------------------");
		northeasternU.showEmployees();
		
		northeasternU.show();
		
		System.out.println("\n-------------------Sorting student list By Id-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getId(), arg1.getId());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By Id-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getId(), arg1.getId());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting student list By Age-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getAge(), arg1.getAge());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By Age-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getAge(), arg1.getAge());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting student list By First Name-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getFirstName().compareToIgnoreCase(arg1.getFirstName());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By First Name-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getFirstName().compareToIgnoreCase(arg1.getFirstName());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting student list By Last Name-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getLastName().compareToIgnoreCase(arg1.getLastName());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By Last Name-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getLastName().compareToIgnoreCase(arg1.getLastName());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		System.out.println("\n-------------------Sorting students list By GPA-------------------");
		northeasternU.sortStudents(null);
		northeasternU.showStudents();
		
		System.out.println("\n-------------------Sorting employee list By Wage-------------------");
		northeasternU.sortEmployees(null);
		northeasternU.showEmployees();
		
		northeasternU.show();
	}
	
	@Override
	public void show() {
		//toString();
		System.out.println("\n-----------------------Showing NorthestrernU Object-----------------------");
		for (AbstractPersonAPI element : list) {
			System.out.println(element);
		}
	}

	@Override
	public String toString() {
		return "\nNortheasternU [list=" + list + "]";
	}
	
}
