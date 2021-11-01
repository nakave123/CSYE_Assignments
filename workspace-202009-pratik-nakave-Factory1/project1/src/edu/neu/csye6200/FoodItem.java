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
public class FoodItem extends Item{
	
	public static String[] csvStrings = { "1,5.55,Milk", 
										  "2,8.95,Salt", 
										  "3,3.38,Curd" };

	public static List<FoodItem> listOfItems = new ArrayList<>();
	
	public FoodItem() {
		FileUtility<FoodItem> fileUtility = new FileUtility<FoodItem>(FoodItem.class);
		fileUtility.writeCSV("FoodItemCSV.txt", csvStrings);
		createObjects();
		Store.items.addAll(listOfItems);
	}

	public FoodItem(int id, double price, String name) {
		super(id, price, name);
	}
	
	public FoodItem(String csvString) {
		//Constructor is being used for parsing csv String and creating FoodItem objects
		System.out.println("----FoodItem constructor is being used for parsing CSV string into object----");
		List<FoodItem> foodItemList = parseString(csvString);
		listOfItems.addAll(foodItemList);
	}

	@Override
	public String toString() {

		return "FoodItem [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
	private void createObjects() {

		for (String string : csvStrings) {
			new FoodItem(string);
		}
	}

	private List<FoodItem> parseString(String csvString) {
		List<FoodItem> foodItemList = new ArrayList<FoodItem>();
		String[] foodAttributes = csvString.split(",");
		int id = 0;
		id = Integer.parseInt(foodAttributes[0]);
		double price = 0.0;
		price = Double.parseDouble(foodAttributes[1]);
		foodItemList.add(new FoodItem(id,price,foodAttributes[2]));
		return foodItemList;
	}

	
}
