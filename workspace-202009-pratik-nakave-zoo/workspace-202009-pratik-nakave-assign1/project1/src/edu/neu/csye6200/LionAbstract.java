/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class LionAbstract extends AbstractAnimalAPI{

	@Override
	public void speak() {
		System.out.println("I am LionAbstract extending AbstractAnimalAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LionAbstract extending AbstractAnimalAPI called toString()");
		return sb.toString() ;
	}

	
}
