/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class ElectronicItem extends Item {

	public static String[] csvStrings = { "4,55.55,Cell", 
										  "5,8.95,Wire" };
	
	public static List<Item> listOfItems = new ArrayList<Item>();
	
	public ElectronicItem(int id, double price, String name) {
		super(id, price, name);
	}
	
	public ElectronicItem() {
		FileUtility<ElectronicItem> fileUtility = new FileUtility<ElectronicItem>(ElectronicItem.class);
		fileUtility.writeCSV("ElectronicItemCSV.txt", csvStrings);
		Store.items.addAll(fileUtility.readCSVFile("ElectronicItemCSV.txt", csvStrings));
	}

	@Override
	public String toString() {

		return "ElectronicItem [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	
}
