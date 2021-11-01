/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Item {

	int id;
	double price;
	String name;
	
	public Item() {
		new Item(this.id,this.price,this.name);
	}
	
	public Item(int id, double price, String name) {
		//super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	/*
	 * @Override public int compareTo(Item arg0) {
	 * 
	 * return Integer.compare(this.getId(), arg0.getId()); }
	 */
	public static <T extends Item> int compareByName(T o1, T o2) {	
		return o1.getName().compareToIgnoreCase(o2.getName());	
	}
	
	public static <T extends Item> int compareByPrice(T o1, T o2) {	
		return Double.compare(o1.getPrice(), o2.getPrice());	
	}
}
