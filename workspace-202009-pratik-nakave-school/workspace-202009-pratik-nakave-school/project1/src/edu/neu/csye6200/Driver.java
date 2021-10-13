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

		School.demo();
		
		System.out.println("\n" + "Driver finished execution here...");

	}
	
	
/**
* 
==================OUTPUT=================
Driver started execution from here...

***************Added 5 students in the Student list*****************
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=27 has name=W and age=32 scored GPA: 3.99
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=68 has name=J and age=49 scored GPA: 2.13

***************Added 5 students in the Person list******************
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=83 has name=X and age=68 scored GPA: 3.31
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=38 has name=M and age=45 scored GPA: 2.25

====================================================================

---------------Sorted studentRoster list by GPA----------------
Student with id=68 has name=J and age=49 scored GPA: 2.13
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=27 has name=W and age=32 scored GPA: 3.99

====================================================================
Sorted using GPA Comparator on student roster list
Student with id=68 has name=J and age=49 scored GPA: 2.13
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=27 has name=W and age=32 scored GPA: 3.99

---------------Sorted studentRoster list by Name----------------
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=68 has name=J and age=49 scored GPA: 2.13
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=27 has name=W and age=32 scored GPA: 3.99

====================================================================
Sorted using Name Comparator on student roster list
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=68 has name=J and age=49 scored GPA: 2.13
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=27 has name=W and age=32 scored GPA: 3.99

---------------Sorted studentRoster list by Age----------------
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=27 has name=W and age=32 scored GPA: 3.99
Student with id=68 has name=J and age=49 scored GPA: 2.13

====================================================================
Sorted using Age Comparator on student roster list
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=27 has name=W and age=32 scored GPA: 3.99
Student with id=68 has name=J and age=49 scored GPA: 2.13

---------------Sorted studentRoster list by Id----------------
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=27 has name=W and age=32 scored GPA: 3.99
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=68 has name=J and age=49 scored GPA: 2.13

====================================================================
Sorted using Id Comparator on student roster list
Student with id=19 has name=B and age=19 scored GPA: 3.53
Student with id=27 has name=W and age=32 scored GPA: 3.99
Student with id=35 has name=C and age=25 scored GPA: 3.15
Student with id=42 has name=R and age=23 scored GPA: 2.53
Student with id=68 has name=J and age=49 scored GPA: 2.13

====================================================================

---------------Sorted personRoster list by GPA-----------------
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=83 has name=X and age=68 scored GPA: 3.31
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=55 has name=E and age=29 scored GPA: 3.5

====================================================================
Sorted using GPA Comparator on person roster list
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=83 has name=X and age=68 scored GPA: 3.31
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=55 has name=E and age=29 scored GPA: 3.5

---------------Sorted personRoster list by Name----------------
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=83 has name=X and age=68 scored GPA: 3.31

====================================================================
Sorted using Name Comparator on person roster list
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=83 has name=X and age=68 scored GPA: 3.31

---------------Sorted personRoster list by Age----------------
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=83 has name=X and age=68 scored GPA: 3.31

====================================================================
Sorted using Age Comparator on person roster list
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=83 has name=X and age=68 scored GPA: 3.31

---------------Sorted personRoster list by Id----------------
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=83 has name=X and age=68 scored GPA: 3.31

====================================================================
Sorted using Id Comparator on person roster list
Student with id=12 has name=P and age=17 scored GPA: 2.83
Student with id=38 has name=M and age=45 scored GPA: 2.25
Student with id=55 has name=E and age=29 scored GPA: 3.5
Student with id=57 has name=A and age=37 scored GPA: 3.33
Student with id=83 has name=X and age=68 scored GPA: 3.31

Driver finished execution here...

*/	
		
}
