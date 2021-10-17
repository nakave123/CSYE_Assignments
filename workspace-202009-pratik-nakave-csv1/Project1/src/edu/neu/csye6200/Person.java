/**
 * 
 */
package edu.neu.csye6200;

import java.util.Comparator;

/**
 * @author pnakave
 *
 */
public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String parentFirstName;
	private String parentLastName;
	private int age;
	
	public Person(int id, String firstName, String lastName, String parentFirstName, String parentLastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
		this.age = age;
	}
	
	public Person() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fisrtName) {
		this.firstName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "";
	}
	
	public static <T extends Person> int compareByFirstName(T o1, T o2) {	
		return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());	
	}
	
	public static <T extends Person> int compareById(T o1, T o2) {	
		return Integer.compare(o1.getId(), o2.getId());	
	}
	
	public static <T extends Person> int compareByAge(T o1, T o2) {	
		return Integer.compare(o1.getAge(), o2.getAge());	
	}
	
	public static <T extends Person> int compareByLastName(T o1, T o2) {	
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());	
	}
	
	//Id comparators to compare ids
	public class IdComparator<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			return ((Person) o1).getId() > ((Person) o2).getId() ? 1
					: (((Person) o1).getId() < ((Person) o2).getId() ? -1 : 0);
		}

	}
		
	//Name comparators to compare names
	public class FirstNameComparator<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			return ((Person) o1).getFirstName().compareToIgnoreCase(((Person) o2).getFirstName());
		}

	}
	
	public class LastNameComparator<T> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			return ((Person) o1).getLastName().compareToIgnoreCase(((Person) o2).getLastName());
		}

	}
	
}
