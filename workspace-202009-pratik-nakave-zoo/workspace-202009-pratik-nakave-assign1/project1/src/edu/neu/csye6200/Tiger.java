/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Tiger extends AnimalAPI {

	@Override
	public void speak() {
		System.out.println("I am a Tiger extending AnimalAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tiger extending AnimalAPI called toString()");
		return sb.toString() ;
	}

	
}
