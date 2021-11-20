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
public class UniversityBase extends AbstractSchoolAPI {
	
	public List<AbstractPersonAPI> employeeRoster = new ArrayList<AbstractPersonAPI>();
	public List<AbstractPersonAPI> studentRoster = new ArrayList<AbstractPersonAPI>();
	
	public static List<AbstractPersonAPI> list = new ArrayList<AbstractPersonAPI>();

	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		// TODO Auto-generated method stub
		employeeRoster.add(employee);
		list.add(employee);
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		// TODO Auto-generated method stub
		studentRoster.add(student);
		list.add(student);
	}

	@Override
	public String getEmployeesInfo() {
		// TODO Auto-generated method stub
		StringBuilder employeeIfo = new StringBuilder();
		for (AbstractPersonAPI element : list) {
			if(element instanceof Employee) {
				employeeIfo.append(element).append("\n");
			}
		}
		return employeeIfo.toString();
	}

	@Override
	public void showEmployees() {
		// TODO Auto-generated method stub
		employeeRoster.forEach(System.out::println);
	}

	@Override
	public String getStudentsInfo() {
		// TODO Auto-generated method stub
		StringBuilder studentsInfo = new StringBuilder();
		for (AbstractPersonAPI element : list) {
			if(element instanceof Student) {
				studentsInfo.append(element).append("\n");
			}
		}
		return studentsInfo.toString();
	}

	@Override
	public void showStudents() {
		// TODO Auto-generated method stub
		studentRoster.forEach(System.out::println);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		// TODO Auto-generated method stub
		employeeRoster.sort(c);
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		// TODO Auto-generated method stub
		studentRoster.sort(c);
	}

}
