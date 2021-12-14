/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


/**
 * @author pratiknakave
 *
 */
public class WeightLossClubFinal {

	/*
	 * AbstractPerson implementation
	 */
	private class AbstractPerson{
		int id;
		int age;
		String name;
		int weightLbs;
		int weightLossLbs;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWeightLbs() {
			return weightLbs;
		}
		public void setWeightLbs(int weightLbs) {
			this.weightLbs = weightLbs;
		}
		public int getWeightLossLbs() {
			return weightLossLbs;
		}
		public void setWeightLossLbs(int weightLossLbs) {
			this.weightLossLbs = weightLossLbs;
		}
		
	}
	
	/*
	 * AbstractClub implementation
	 */
	private abstract class AbstractClub {
		abstract void add(AbstractPerson p);
		
		abstract void sortAndShow(Comparator<AbstractPerson> compare, Consumer<AbstractPerson> action);
		
		abstract List<Integer> getWeightLossStats();
	}
	
	/*
	 * Person implementation deriving from AbstractPerson
	 */
	private class Person extends AbstractPerson{
		
		//Default Constructor
		Person(){
			
		}
		
		//Parameterized Constructor
		Person(int id, int age, String name, int weightLbs, int weightLossLbs){
			this.id = id;
			this.age = age;
			this.name = name;
			this.weightLbs = weightLbs;
			this.weightLossLbs = weightLossLbs;
		}
		
		//Constructor to parse CSV data and create a Person object
		Person(String CSVData){
			String[] tokens = CSVData.split(",");
			int id = 0;
			int age = 0;
			int weightLbs = 0;
			int weightLossLbs = 0;
			
			try {
				id = Integer.parseInt(tokens[0]);
			} catch (NumberFormatException e) {
				System.err.print("Illigal integer input value parsed : '"+tokens[0]+"'");
				e.printStackTrace();
			}
			try {
				age = Integer.parseInt(tokens[1]);
			} catch (NumberFormatException e) {
				System.err.print("Illigal integer input value parsed : '"+tokens[1]+"'");
				e.printStackTrace();
			}
			try {
				weightLbs = Integer.parseInt(tokens[3]);
			} catch (NumberFormatException e) {
				System.err.print("Illigal integer input value parsed : '"+tokens[3]+"'");
				e.printStackTrace();
			}
			try {
				weightLossLbs = Integer.parseInt(tokens[4]);
			} catch (NumberFormatException e) {
				System.err.print("Illigal integer input value parsed : '"+tokens[4]+"'");
				e.printStackTrace();
			}
			this.id = id;
			this.age = age;
			this.name = tokens[2];
			this.weightLbs = weightLbs;
			this.weightLossLbs = weightLossLbs;
		
		}

		//To show the Person State
		@Override
		public String toString() {
			return "Person [id=" + id + ", age=" + age + ", name=" + name + ", weightLbs=" + weightLbs
					+ ", weightLossLbs=" + weightLossLbs + "]";
		}
	}
	
	/*
	 * WeightLossClub implementation deriving from AbstractClub
	 */
	private class WeightLossClub extends AbstractClub{
		public static List<AbstractPerson> personList = new ArrayList<AbstractPerson>();

		//To add person object in a person list
		@Override
		void add(AbstractPerson p) {
			
			personList.add(p);
		}

		//To sort the list using comparator and show the list using consumer provided
		@Override
		void sortAndShow(Comparator<AbstractPerson> compare, Consumer<AbstractPerson> action) {
			
			personList.stream().sorted(compare).forEach(action);
			
		}

		//To fetch the weight loss parameter from person list for each person. 
		//Returns the list of weight loss per person.
		@Override
		List<Integer> getWeightLossStats() {
			
			List<Integer> wtList = personList.stream().map(n -> n.getWeightLossLbs()).collect(Collectors.toList());
			return wtList;
			
		}
		
	}
	 
	/*This is used if we want to stream through whole person object
	 *and fetch weight for each of the person from list (i.e. without List<Integer> getWeightLossStats() method)
	 * 
	private Consumer<AbstractPerson> graphPersons = (n) -> {
		int wt = n.getWeightLossLbs();
		System.out.print(wt+" ");
		while (wt-- > 0)
			System.out.print("*");
		System.out.println();
	}; */
	
	//To draw a graph as per the weight loss values
	private Consumer<Integer> graphIntegers = (n) -> {
		System.out.print(n+" ");
		while (n-- > 0)
			System.out.print("*");
		System.out.println();
	}; 
	
	/*This is used if we want to stream through whole person object
	 *and fetch weight for each of the person from list (i.e. without List<Integer> getWeightLossStats() method)
	 * 
	public void graphUpDownPersons(List<AbstractPerson> nList) {
		System.out.println();
		List<AbstractPerson> newlist= nList.stream().map(i -> {
			Person p = new Person();
			p.setId(i.getId());
			p.setAge(i.getAge());
			p.setName(i.getName());
			p.setWeightLbs(i.getWeightLbs());
			p.setWeightLossLbs(i.getWeightLossLbs());
			return p;
		}).collect(Collectors.toList());
		newlist.stream().forEach(item -> {
			try {
				graphPersons.accept(item);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	} */
	
	//To draw a graph
	public void graphUpDownIntegers(List<Integer> nList) {
		System.out.println();
		
		nList.forEach(n->graphIntegers.accept(n));
		
	}
	
	public static void demo() {
		
		WeightLossClubFinal obj = new WeightLossClubFinal();
		WeightLossClub club = obj.new WeightLossClub();
		
		//Filling the person list
		WeightLossClub.personList.add(obj.new Person("1,25,Jim,311,11"));
		WeightLossClub.personList.add(obj.new Person("2,21,Sam,315,15"));
		WeightLossClub.personList.add(obj.new Person("3,17,Dan,314,14"));
		WeightLossClub.personList.add(obj.new Person("4,19,Bob,312,12"));
		WeightLossClub.personList.add(obj.new Person("5,16,Ann,310,10"));
		WeightLossClub.personList.add(obj.new Person("6,23,Eve,313,13"));
		
		//Comparators for sorting by name and weight loss
		Comparator<AbstractPerson> comparatorName = Comparator.comparing(AbstractPerson::getName);
		Comparator<AbstractPerson> comparatorWtLoss = Comparator.comparingInt(AbstractPerson::getWeightLossLbs);
		
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("The People's Weight Club ");
		System.out.println("------------------------------------Sorting by Name---------------------------------------");
		club.sortAndShow(comparatorName, System.out::println);
		System.out.println("---------------------------------Sorting by weight loss-----------------------------------");
		club.sortAndShow(comparatorWtLoss, System.out::println);
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println("Graph of weight losses");
		obj.graphUpDownIntegers(club.getWeightLossStats());
		
		
		System.out.println("Graph of weight losses sorted ASC");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().sorted().toList());
		
		System.out.println("Graph of weight losses sorted DES");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().sorted(Comparator.reverseOrder()).toList());
		
		System.out.println("Graph of weight losses after 1 month");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().map(n->n+10).toList());
		
		System.out.println("Graph of weight losses after 1 month sorted ASC");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().sorted().map(n->n+10).toList());
		
		
		System.out.println("Graph of weight losses after 1 month sorted DES");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().sorted(Comparator.reverseOrder()).map(n->n+10).toList());
	
		System.out.println("Graph of weight losses after 12 month");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().map(n->(n+10)*10).toList());
		
		System.out.println("Graph of weight losses after 12 months sorted ASC");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().sorted().map(n->(n+10)*10).toList());
		
		
		System.out.println("Graph of weight losses after 12 months sorted DES");
		obj.graphUpDownIntegers(club.getWeightLossStats().stream().sorted(Comparator.reverseOrder()).map(n->(n+10)*10).toList());
		
		
		/* If we need to process the whole AbstractPerson Object instead of just weightLoss parameter of it
		 * then use below code.
		 * 
		System.out.println("Graph of wt losses sorted ASC");
		obj.graphUpDownPersons(WeightLossClub.personList.stream().sorted(comparatorWtLoss).toList());
		
		System.out.println("Graph of wt losses sorted DES");
		obj.graphUpDownPersons(WeightLossClub.personList.stream().sorted(comparatorWtLoss.reversed()).toList());
		
		
		//System.out.println("Graph of additional wt losses");
		obj.graphUpDownPersons(WeightLossClub.personList.stream().map(i -> {
			Person p = obj.new Person();
			p.setId(i.getId());
			p.setAge(i.getAge());
			p.setName(i.getName());
			p.setWeightLbs(i.getWeightLbs());
			p.setWeightLossLbs(i.getWeightLossLbs() + 10);
			return p;
		}).collect(Collectors.toList()));
		
		
		//System.out.println("Graph of additional wt losses");
		obj.graphUpDownPersons(WeightLossClub.personList.stream().map(i -> {
			Person p = obj.new Person();
			p.setId(i.getId());
			p.setAge(i.getAge());
			p.setName(i.getName());
			p.setWeightLbs(i.getWeightLbs());
			p.setWeightLossLbs((i.getWeightLossLbs() + 10)*10);
			return p;
		}).collect(Collectors.toList()));
		
		*/
	}
}
