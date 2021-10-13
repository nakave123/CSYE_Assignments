/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Person {

	private int id;
	private String name;
	private int age;
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [Id=" + id + "name=" + name + ", age=" + age + "]";
	}
	
	public static <T extends Person> int compareByName(T o1, T o2) {	
		return o1.getName().compareToIgnoreCase(o2.getName());	
	}
	
	public static <T extends Person> int compareById(T o1, T o2) {	
		return Integer.compare(o1.getId(), o2.getId());	
	}
	
	public static <T extends Person> int compareByAge(T o1, T o2) {	
		return Integer.compare(o1.getAge(), o2.getAge());	
	}
	
	public static int compareToPersonRoster(Person p1, Person p2) {
		Student s1 = (Student) p1;
		Student s2 = (Student) p2;
		return Double.compare(s1.getGpa(),s2.getGpa());
	}
	
}
