/**
 * 
 */
package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class FileUtility<T>{
	
	private T t;
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
	public FileUtility(T t) {
		super();
		this.t = t;
	}

	public List<T> readCSVFile(String fileName) {
		List<T> list = new ArrayList<T>();
		try (FileReader fr = new FileReader(fileName);
				BufferedReader inLine = new BufferedReader(fr); ){
				System.out.println("\n"+"------------------BufferedReader: '" + fileName + "' ----------------------");
			String thisLine = null;
			while ((thisLine = inLine.readLine()) != null) {
				String[] Object = thisLine.split(",");
				int id = 0;
				int age=0;
				try {
					id = Integer.parseInt(Object[0]);
				} catch (NumberFormatException e) {
					System.err.println("'" + "' is ILLIGAL String representation of (integer) Id provided.");
				}
				try {
					age = Integer.parseInt(Object[5]);
				} catch (Exception e1) {
					System.err.println("'" + "' is ILLIGAL String representation of (integer) Age provided.");
				}
				if(this.t instanceof Student) {
					int studentId = 0;
					double gpa = 0.0;
					try {
						studentId = Integer.parseInt(Object[6]);
						gpa = Double.parseDouble(Object[7]);
					} catch (NumberFormatException e) {
						System.err.println("'" + "' is ILLIGAL String representation of (integer/double) StudentId/GPA provided.");
					}
					list.add((T) new Student(id,Object[1],Object[2],Object[3],Object[4],age,studentId,gpa));
				}
				else {
					double hourlyWage = 0;
					try {
						hourlyWage = Double.parseDouble(Object[6]);
					} catch (NumberFormatException e) {
						System.err.println("'" + "' is ILLIGAL String representation of (double) HourlyWage provided.");
					}
					list.add((T) new Teacher(id, Object[1], Object[2], Object[3], Object[4], age, hourlyWage));
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public static void writeCSVFile(String fileName, String[] array) {
		System.out.println("\n"+"------------------BufferedWriter: '" + fileName + "' ----------------------");
		try (FileWriter fw = new FileWriter(fileName); 
				BufferedWriter out = new BufferedWriter(fw);) {
			for (String record : array) {
				out.write(record);
				out.newLine();
			}
			out.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
