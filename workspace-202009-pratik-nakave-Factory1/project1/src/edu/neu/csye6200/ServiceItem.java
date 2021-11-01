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
public class ServiceItem extends Item {
	
	public static String[] csvStrings = { "6,15.55,Rent", 
			  							  "7,28.95,Wifi"};
	
	public static List<ServiceItem> listOfItems = new ArrayList<ServiceItem>();

	public ServiceItem(int id, double price, String name) {
		super(id, price, name);
	}
	
	public ServiceItem() {
		super();
		FileUtility<ServiceItem> fileUtility = new FileUtility<ServiceItem>(ServiceItem.class);
		fileUtility.writeCSV("ServiceItemCSV.txt", csvStrings);
		Store.items.addAll(fileUtility.readCSVFile("ServiceItemCSV.txt", csvStrings));
	}

	@Override
	public String toString() {
		
		return "ServiceItem [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	
}
