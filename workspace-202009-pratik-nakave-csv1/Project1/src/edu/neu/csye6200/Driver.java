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
		System.out.println("Driver started execution from here...");

		Student.demo();
		Teacher.demo();
		
		System.out.println("\n" + "Driver finished execution here...");

	}
	
	
/**
* 
==================OUTPUT=================
Driver started execution from here...
---------------Unsorted CSV record data---------------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA
11	Peter	Hanks	Kelab	Hanks	22	128	4.0
29	Jenny	Smith	Klaus	Smith	66	101	3.0
31	Tommy	Woods	Merry	Woods	88	174	2.0
47	Dolly	Tahir	Harry	Tahir	38	136	2.5

------------------BufferedWriter: 'Student_csv.txt' ----------------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA	
11	Peter	Hanks	Kelab	Hanks	22	128	4.0
29	Jenny	Smith	Klaus	Smith	66	101	3.0
31	Tommy	Woods	Merry	Woods	88	174	2.0
47	Dolly	Tahir	Harry	Tahir	38	136	2.5

------------------BufferedReader: 'Student_csv.txt' ----------------------

---------------Sorted studentList list by Id----------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA	
11	Peter	Hanks	Kelab	Hanks	22	128	4.0
29	Jenny	Smith	Klaus	Smith	66	101	3.0
31	Tommy	Woods	Merry	Woods	88	174	2.0
47	Dolly	Tahir	Harry	Tahir	38	136	2.5

---------------Sorted studentList list by Student Id----------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA	
29	Jenny	Smith	Klaus	Smith	66	101	3.0
11	Peter	Hanks	Kelab	Hanks	22	128	4.0
47	Dolly	Tahir	Harry	Tahir	38	136	2.5
31	Tommy	Woods	Merry	Woods	88	174	2.0

---------------Sorted studentList list by FirstName----------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA	
47	Dolly	Tahir	Harry	Tahir	38	136	2.5
29	Jenny	Smith	Klaus	Smith	66	101	3.0
11	Peter	Hanks	Kelab	Hanks	22	128	4.0
31	Tommy	Woods	Merry	Woods	88	174	2.0

---------------Sorted studentList list by LastName----------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA	
11	Peter	Hanks	Kelab	Hanks	22	128	4.0
29	Jenny	Smith	Klaus	Smith	66	101	3.0
47	Dolly	Tahir	Harry	Tahir	38	136	2.5
31	Tommy	Woods	Merry	Woods	88	174	2.0

---------------Sorted studentList list by GPA----------------
ID	FName	LName	PFName	PLName	Age	StudId	GPA	
31	Tommy	Woods	Merry	Woods	88	174	2.0
47	Dolly	Tahir	Harry	Tahir	38	136	2.5
29	Jenny	Smith	Klaus	Smith	66	101	3.0
11	Peter	Hanks	Kelab	Hanks	22	128	4.0

------------------BufferedWriter: 'Teacher_csv.txt' ----------------------
ID	FName	LName	PFName	PLName	Age	HourlyWage
5	John	Markson	Timothy	Markson	65	100.0

------------------BufferedReader: 'Teacher_csv.txt' ----------------------
ID	FName	LName	PFName	PLName	Age	HourlyWage
5	John	Markson	Timothy	Markson	65	100.0	

Driver finished execution here...

*/	
		
}
