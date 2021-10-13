/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class TigerAbstarct extends AbstractAnimalAPI {

	@Override
	public void speak() {
		System.out.println("I am TigerAbstarct extending from AbstractAnimalAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TigerAbstarct extending from AbstractAnimalAPI called toString()");
		return sb.toString() ;
	}

	
}
