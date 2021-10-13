/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Elephant extends AnimalAPI {

	@Override
	public void speak() {
		System.out.println("I am an Elephant extending AnimalAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Elephant extending AnimalAPI called toString()");
		return sb.toString() ;
	}

	
}
