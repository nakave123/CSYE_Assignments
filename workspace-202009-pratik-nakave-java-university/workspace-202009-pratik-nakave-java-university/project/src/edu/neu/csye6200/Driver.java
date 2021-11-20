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
		System.out.println("Driver started execution here...");
		
		NortheasternU.demo();
		
		System.out.println("Driver finished execution here...");
	}
	
/*
 * ==============================OUTPUT================================
 * Driver started execution here...
-------------------Showing student list-------------------
Student with Id= 25 FirstName= I LastName= U and Age= 51
Student with Id= 15 FirstName= V LastName= C and Age= 78
Student with Id= 8 FirstName= W LastName= B and Age= 57

-------------------Showing employee list-------------------
Employee with Id= 47 FirstName= E LastName= R and Age= 27
Employee with Id= 37 FirstName= T LastName= G and Age= 49
Employee with Id= 18 FirstName= Q LastName= L and Age= 82

-----------------------Showing NorthestrernU Object-----------------------
Student with Id= 25 FirstName= I LastName= U and Age= 51
Student with Id= 15 FirstName= V LastName= C and Age= 78
Student with Id= 8 FirstName= W LastName= B and Age= 57
Employee with Id= 47 FirstName= E LastName= R and Age= 27
Employee with Id= 37 FirstName= T LastName= G and Age= 49
Employee with Id= 18 FirstName= Q LastName= L and Age= 82

-------------------Sorting student list By Id-------------------
Student with Id= 8 FirstName= W LastName= B and Age= 57
Student with Id= 15 FirstName= V LastName= C and Age= 78
Student with Id= 25 FirstName= I LastName= U and Age= 51

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting employee list By Id-------------------
Employee with Id= 18 FirstName= Q LastName= L and Age= 82
Employee with Id= 37 FirstName= T LastName= G and Age= 49
Employee with Id= 47 FirstName= E LastName= R and Age= 27

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting student list By Age-------------------
Student with Id= 25 FirstName= I LastName= U and Age= 51
Student with Id= 8 FirstName= W LastName= B and Age= 57
Student with Id= 15 FirstName= V LastName= C and Age= 78

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting employee list By Age-------------------
Employee with Id= 47 FirstName= E LastName= R and Age= 27
Employee with Id= 37 FirstName= T LastName= G and Age= 49
Employee with Id= 18 FirstName= Q LastName= L and Age= 82

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting student list By First Name-------------------
Student with Id= 25 FirstName= I LastName= U and Age= 51
Student with Id= 15 FirstName= V LastName= C and Age= 78
Student with Id= 8 FirstName= W LastName= B and Age= 57

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting employee list By First Name-------------------
Employee with Id= 47 FirstName= E LastName= R and Age= 27
Employee with Id= 18 FirstName= Q LastName= L and Age= 82
Employee with Id= 37 FirstName= T LastName= G and Age= 49

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting student list By Last Name-------------------
Student with Id= 8 FirstName= W LastName= B and Age= 57
Student with Id= 15 FirstName= V LastName= C and Age= 78
Student with Id= 25 FirstName= I LastName= U and Age= 51

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting employee list By Last Name-------------------
Employee with Id= 37 FirstName= T LastName= G and Age= 49
Employee with Id= 18 FirstName= Q LastName= L and Age= 82
Employee with Id= 47 FirstName= E LastName= R and Age= 27

NortheasternU [list=[Student with Id= 25 FirstName= I LastName= U and Age= 51, Student with Id= 15 FirstName= V LastName= C and Age= 78, Student with Id= 8 FirstName= W LastName= B and Age= 57, Employee with Id= 47 FirstName= E LastName= R and Age= 27, Employee with Id= 37 FirstName= T LastName= G and Age= 49, Employee with Id= 18 FirstName= Q LastName= L and Age= 82]]

-------------------Sorting students list By GPA-------------------
Student with Id= 15 FirstName= V LastName= C Age= 78 and GPA= 2.6
Student with Id= 25 FirstName= I LastName= U Age= 51 and GPA= 3.2
Student with Id= 8 FirstName= W LastName= B Age= 57 and GPA= 3.9

-------------------Sorting employee list By Wage-------------------
Employee with Id= 18 FirstName= Q LastName= L Age= 82 and Wage= 50.0
Employee with Id= 47 FirstName= E LastName= R Age= 27 and Wage= 70.0
Employee with Id= 37 FirstName= T LastName= G Age= 49 and Wage= 90.0

-----------------------Showing NorthestrernU Object-----------------------
Student with Id= 25 FirstName= I LastName= U and Age= 51
Student with Id= 15 FirstName= V LastName= C and Age= 78
Student with Id= 8 FirstName= W LastName= B and Age= 57
Employee with Id= 47 FirstName= E LastName= R and Age= 27
Employee with Id= 37 FirstName= T LastName= G and Age= 49
Employee with Id= 18 FirstName= Q LastName= L and Age= 82
Driver finished execution here...

 */

}
