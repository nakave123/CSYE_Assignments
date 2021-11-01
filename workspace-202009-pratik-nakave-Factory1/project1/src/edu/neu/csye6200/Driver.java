/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Driver execution started here...\n");

		Store store = new Store();
		store.demo();
		
		System.out.println("\nDriver execution finished here...");
	}

}

/**
 * -----------------------OUTPUT----------------------
 * Driver execution started here...

------------------BufferedWriter writing to FoodItemCSV.txt file-----------------
----FoodItem constructor is being used for parsing CSV string into object----
----FoodItem constructor is being used for parsing CSV string into object----
----FoodItem constructor is being used for parsing CSV string into object----
------------------BufferedWriter writing to ElectronicItemCSV.txt file-----------------
------------------BufferedReader reading from ElectronicItemCSV.txt file-----------------
------------------BufferedWriter writing to ServiceItemCSV.txt file-----------------
------------------BufferedReader reading from ServiceItemCSV.txt file-----------------
------------------BufferedWriter writing to ElectronicItemCSV.txt file-----------------
------------------BufferedReader reading from ElectronicItemCSV.txt file-----------------
------------------BufferedWriter writing to ServiceItemCSV.txt file-----------------
------------------BufferedReader reading from ServiceItemCSV.txt file-----------------

------------------- 11 Items added into the list---------------------

FoodItem [id=1, price=5.55, name=Milk]
FoodItem [id=2, price=8.95, name=Salt]
FoodItem [id=3, price=3.38, name=Curd]
ElectronicItem [id=4, price=55.55, name=Cell]
ElectronicItem [id=5, price=8.95, name=Wire]
ServiceItem [id=6, price=15.55, name=Rent]
ServiceItem [id=7, price=28.95, name=Wifi]
ElectronicItem [id=4, price=55.55, name=Cell]
ElectronicItem [id=5, price=8.95, name=Wire]
ServiceItem [id=6, price=15.55, name=Rent]
ServiceItem [id=7, price=28.95, name=Wifi]

---------------------Sort By Name--------------------
ID 	 PRICE 	 NAME 
----------------------------
4 	 55.55 	 Cell
----------------------------
4 	 55.55 	 Cell
----------------------------
3 	 3.38 	 Curd
----------------------------
1 	 5.55 	 Milk
----------------------------
6 	 15.55 	 Rent
----------------------------
6 	 15.55 	 Rent
----------------------------
2 	 8.95 	 Salt
----------------------------
7 	 28.95 	 Wifi
----------------------------
7 	 28.95 	 Wifi
----------------------------
5 	 8.95 	 Wire
----------------------------
5 	 8.95 	 Wire
----------------------------

---------------------Sort By Price--------------------
ID 	 PRICE 	 NAME 
----------------------------
3 	 3.38 	 Curd
----------------------------
1 	 5.55 	 Milk
----------------------------
2 	 8.95 	 Salt
----------------------------
5 	 8.95 	 Wire
----------------------------
5 	 8.95 	 Wire
----------------------------
6 	 15.55 	 Rent
----------------------------
6 	 15.55 	 Rent
----------------------------
7 	 28.95 	 Wifi
----------------------------
7 	 28.95 	 Wifi
----------------------------
4 	 55.55 	 Cell
----------------------------
4 	 55.55 	 Cell
----------------------------

---------------------Sort By ID--------------------
ID 	 PRICE 	 NAME 
----------------------------
1 	 5.55 	 Milk
----------------------------
2 	 8.95 	 Salt
----------------------------
3 	 3.38 	 Curd
----------------------------
4 	 55.55 	 Cell
----------------------------
4 	 55.55 	 Cell
----------------------------
5 	 8.95 	 Wire
----------------------------
5 	 8.95 	 Wire
----------------------------
6 	 15.55 	 Rent
----------------------------
6 	 15.55 	 Rent
----------------------------
7 	 28.95 	 Wifi
----------------------------
7 	 28.95 	 Wifi
----------------------------

Driver execution finished here...

 */