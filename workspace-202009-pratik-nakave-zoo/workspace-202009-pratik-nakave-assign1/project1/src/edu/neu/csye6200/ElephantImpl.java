/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class ElephantImpl implements AnimalisticAPI {

	@Override
	public void speak() {
		System.out.println("I am an ElephantImpl implementing AnimalisticAPI");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ElephantImpl implementing AnimalisticAPI called toString()");
		return sb.toString() ;
	}

}
