/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class StudentFactory implements PersonEnity {
	/*
	 * Eager Singleton Implementation
	 */

	private static StudentFactory instance = new StudentFactory();
	
	private StudentFactory() {
		
	}
	
	public static synchronized StudentFactory getInstance() {
		return instance;
	}
	
	
	@Override
	public AbstractPersonAPI getObject() {
		// TODO Auto-generated method stub
		return new Student("8,57,W,B,3.9");
	}

}
