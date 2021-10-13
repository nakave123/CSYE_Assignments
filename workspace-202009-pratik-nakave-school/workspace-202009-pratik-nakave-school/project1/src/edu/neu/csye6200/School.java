/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class School {

	public static List<Student> studentRoster = new ArrayList<Student>();
	public static List<Person> personRoster = new ArrayList<Person>();
	public static School school = new School();
	
	public static void demo() {
		
		//Method to add student into student list
		addToStudentRoster(new Student(42, "R", 23, 2.53));
		addToStudentRoster(new Student(19, "B", 19, 3.53));
		addToStudentRoster(new Student(27, "W", 32, 3.99));
		addToStudentRoster(new Student(35, "C", 25, 3.15));
		addToStudentRoster(new Student(68, "J", 49, 2.13));
		System.out.println("\n" + "***************Added " + studentRoster.size() + " students in the Student list*****************");
		studentRoster.forEach(System.out::println);
		
		//Method to add student into person list
		addToPersonRoster(new Student(12, "P", 17, 2.83));
		addToPersonRoster(new Student(57, "A", 37, 3.33));
		addToPersonRoster(new Student(83, "X", 68, 3.31));
		addToPersonRoster(new Student(55, "E", 29, 3.50));
		addToPersonRoster(new Student(38, "M", 45, 2.25));
		System.out.println("\n" + "***************Added " + personRoster.size() + " students in the Person list******************");
		personRoster.forEach(System.out::println);
		
		//Method to sort student into student list
		System.out.println("\n" + "====================================================================");
		sortStudentRoster(studentRoster);
		
		////Method to sort student into person list
		System.out.println("\n" + "====================================================================");
		sortPersonRoster(personRoster);
		
	}

	private static void addToPersonRoster(Student student) {
		personRoster.add(student);
	}

	public static void addToStudentRoster(Student student) {
		studentRoster.add(student);
	}
	
	public static void sortStudentRoster(List<Student> studentRoster) {
		//Sort by GPA
		studentRoster.sort(Student::compareTo);
		System.out.println("\n" + "---------------Sorted " + "studentRoster list by GPA----------------");
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using GPA Comparator on student roster list");
		Collections.sort(studentRoster, new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {

				return Double.compare(arg0.getGpa(),arg1.getGpa());
			}
		});
		studentRoster.forEach(System.out::println);

		//Sort by Name
		studentRoster.sort(Student::compareByName);
		System.out.println("\n" + "---------------Sorted " + "studentRoster list by Name----------------");
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using Name Comparator on student roster list");
		Collections.sort(studentRoster, school.new NameComparator<Student>());
		studentRoster.forEach(System.out::println);

		//Sort by Age
		studentRoster.sort(Student::compareByAge);
		System.out.println("\n" + "---------------Sorted " + "studentRoster list by Age----------------");
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using Age Comparator on student roster list");
		Collections.sort(studentRoster, school.new AgeComparator<Student>());
		studentRoster.forEach(System.out::println);

		//Sort by ID
		studentRoster.sort(Student::compareById);
		System.out.println("\n" + "---------------Sorted " + "studentRoster list by Id----------------");
		studentRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using Id Comparator on student roster list");
		Collections.sort(studentRoster, school.new IdComparator<Student>());
		studentRoster.forEach(System.out::println);
	}
	
	public static void sortPersonRoster(List<Person> personRoster) {
		
		//Sort by GPA
		personRoster.sort(Person::compareToPersonRoster);
		System.out.println("\n" + "---------------Sorted " + "personRoster list by GPA-----------------");
		personRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using GPA Comparator on person roster list");
		Collections.sort(personRoster, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {

				return Double.compare(((Student) arg0).getGpa(),((Student) arg1).getGpa());
			}
		});
		personRoster.forEach(System.out::println);

		//Sort by Name
		personRoster.sort(Person::compareByName);
		System.out.println("\n" + "---------------Sorted " + "personRoster list by Name----------------");
		personRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using Name Comparator on person roster list");
		Collections.sort(personRoster, school.new NameComparator<Person>());
		personRoster.forEach(System.out::println);

		//Sort by Age
		personRoster.
		sort(Person::compareByAge);
		System.out.println("\n" + "---------------Sorted " + "personRoster list by Age----------------");
		personRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using Age Comparator on person roster list");
		Collections.sort(personRoster, school.new AgeComparator<Person>());
		personRoster.forEach(System.out::println);

		//Sort by ID
		personRoster.sort(Person::compareById);
		System.out.println("\n" + "---------------Sorted " + "personRoster list by Id----------------");
		personRoster.forEach(System.out::println);
		
		System.out.println("\n" + "====================================================================");
		System.out.println("Sorted using Id Comparator on person roster list");
		Collections.sort(personRoster, school.new IdComparator<Person>());
		personRoster.forEach(System.out::println);
	}
	
	//Age comparator to compare ages in both list
	public class AgeComparator<T> implements Comparator<T>{

	    @Override
	    public int compare(T o1, T o2) {
	        return ((Person) o1).getAge() > ((Person) o2).getAge() ? 1 :(((Person) o1).getAge() < ((Person) o2).getAge() ? -1 : 0);
	    }

	}
	
	//Id comparator to compare ages in both list
	public class IdComparator<T> implements Comparator<T>{

	    @Override
	    public int compare(T o1, T o2) {
	        return ((Person) o1).getId() > ((Person) o2).getId() ? 1 :(((Person) o1).getId() < ((Person) o2).getId() ? -1 : 0);
	    }

	}
	
	//Name comparator to compare ages in both list
	public class NameComparator<T> implements Comparator<T>{

	    @Override
	    public int compare(T o1, T o2) {
	        return ((Person) o1).getName().compareToIgnoreCase(((Person) o2).getName());
	    }

	}
	
}