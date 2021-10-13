/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class TigerImpl implements AnimalisticAPI {

	@Override
	public void speak() {
		System.out.println("I am TigerImpl implementing AnimalisticAPI");

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TigerImpl implementing AnimalisticAPI called toString()");
		return sb.toString() ;
	}

}
