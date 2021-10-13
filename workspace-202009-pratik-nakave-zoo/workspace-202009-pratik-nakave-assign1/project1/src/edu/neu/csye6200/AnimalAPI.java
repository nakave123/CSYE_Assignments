/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class AnimalAPI {

	public void speak() {
		System.out.println("This is AnimalAPI...");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AnimalAPI is deriving 3 animals");
		return sb.toString() ;
	}
	
	
}
