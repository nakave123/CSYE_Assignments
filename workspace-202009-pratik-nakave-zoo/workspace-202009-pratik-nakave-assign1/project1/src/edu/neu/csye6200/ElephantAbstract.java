/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class ElephantAbstract extends AbstractAnimalAPI {

	@Override
	public void speak() {
		System.out.println("I am an ElephantAbstract extending AbstractAnimalAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ElephantAbstract extending AbstractAnimalAPI called toString()");
		return sb.toString() ;
	}

	
}
