/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Lion extends AnimalAPI {

	@Override
	public void speak() {
		System.out.println("I am a Lion extending AnimalAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lion extending AnimalAPI called toString()");
		return sb.toString() ;
	}

	
}
