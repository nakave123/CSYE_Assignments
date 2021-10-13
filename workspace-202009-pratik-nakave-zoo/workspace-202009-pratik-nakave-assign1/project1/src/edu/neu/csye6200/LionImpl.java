/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class LionImpl implements AnimalisticAPI {

	@Override
	public void speak() {
		System.out.println("I am LionImpl implementing AnimalisticAPI");
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LionImpl implementing AnimalisticAPI called toString()");
		return sb.toString() ;
	}

}
