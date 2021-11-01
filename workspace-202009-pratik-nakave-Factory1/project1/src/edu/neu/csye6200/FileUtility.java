/**
 * 
 */
package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class FileUtility<T> {

	final Class<T> t;
	
	FileUtility(Class<T> t){
		this.t = t;
	}
	
	/*
	 * To read from CSV file and create objects
	 */
	public List<Item> readCSVFile(String fileName, String[] array){
		System.out.println("------------------BufferedReader reading from "+fileName+" file-----------------");
		List<Item> list = new ArrayList<Item>();
		try(BufferedReader br = new BufferedReader(new  FileReader(fileName))){
			String inputLine = null;
			
			while((inputLine = br.readLine())!=null){
				String[] itemAttributes = inputLine.split(",");
				int id = 0;
				try {
					id = Integer.parseInt(itemAttributes[0]);
				} catch (NumberFormatException e) {
					System.out.println("'" + itemAttributes[0] + "' Illegal representation. Need integer value.");
					e.printStackTrace();
				}
				double price = 0.0;
				try {
					price = Double.parseDouble(itemAttributes[1]);
				} catch (NumberFormatException e) {
					System.out.println("'" + itemAttributes[1] + "' Illegal representation. Need double value.");
					e.printStackTrace();
				}
				if(t.isAssignableFrom(ElectronicItem.class)) {
					list.add(new ElectronicItem(id,price,itemAttributes[2]));
				}
				else {
					list.add(new ServiceItem(id,price,itemAttributes[2]));
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/*
	 * To write into CSV file
	 */
	public void writeCSV(String fileName, String[] arrray) {
		System.out.println("------------------BufferedWriter writing to "+fileName+" file-----------------");
		try ( FileWriter fw = new FileWriter(fileName);
				BufferedWriter out= new BufferedWriter(fw);) {
				for (String name : arrray) {
					out.write(name);
					out.newLine();
				}
				out.flush();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
