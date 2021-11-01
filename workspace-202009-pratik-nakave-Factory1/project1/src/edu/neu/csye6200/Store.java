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
public class Store extends AbstractStore {

	public static List<Item> items = new ArrayList<Item>();
	public static List<ItemFactory> factory = new ArrayList<ItemFactory>();
	
	public void addToFactory(ItemFactory f) {
		factory.add(f);
	}
	
	public void addToItem(Item i) {
		items.add(i);
	}
	
	public void demo() {
		Store store = new Store();
		store.addToFactory(new FoodItemFactory());										//Factory Pattern is used
		//store.addToFactory(new ElectronicItemFactory());	//This is partially correct. We don't use public constructor.
		//store.addToFactory(new ServiceItemFactory());
		
		//store.addToFactory(ElectronicItemFactory.getInstance());						//Singleton Pattern is used (Lazy)
		//store.addToFactory(ServiceItemFactory.getInstance());							//Singleton Pattern is used (Eager)
		
		
		for (ItemFactory itemFactory : factory) { itemFactory.getObject(); }
		 
		
		ElectronicItemFactory.getInstance().getObject();		//Using private constructor is a good practice.
		ServiceItemFactory.getInstance().getObject();
		
		System.out.println("\n------------------- "+ items.size() + " Items added into the list---------------------\n");
		
		/*
		 * Overriding toString() method
		 */
		for (Item item : items) {
			System.out.println(item);
		}
		
		/*
		 * To sort Items by ID, Name, Price
		 */
		store.sortItems();
	}

	public void sortItems() {
		Store store = new Store();
		
		System.out.println("\n---------------------Sort By Name--------------------");
		//Collections.sort(items, store.new NameComparator());							//Sort using Comparator
		items.sort(Item::compareByName);												//Sort using Comparable
		printList(items);
		
		System.out.println("\n---------------------Sort By Price--------------------");
		Collections.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item arg0, Item arg1) {
				return Double.compare(arg0.getPrice(), arg1.getPrice());
			}
		});
		//Collections.sort(items, store.new PriceComparator());							//Sort using Comparator
		//items.sort(Item::compareByPrice);												//Sort using Comparable
		printList(items);
		
		System.out.println("\n---------------------Sort By ID--------------------");
		items.sort(store.new IdComparator());											//Sort using Comparator
		printList(items);
	}
	
	public void printList(List<Item> itemsList) {
		System.out.println("ID \t PRICE \t NAME ");
		System.out.println("----------------------------");
		for (Item item : itemsList) {
			System.out.println(+item.getId()+" \t "+item.getPrice()+" \t "+item.getName());
			System.out.println("----------------------------");
		}
	}
}
