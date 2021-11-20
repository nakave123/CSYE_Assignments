/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class EmployeeFactory implements PersonEnity {

	/*
	 * Lazy Singleton Implementation
	 */
	private static EmployeeFactory instance;
	
	private EmployeeFactory() {
		
	}
	
	public static synchronized EmployeeFactory getInsance() {
		if(instance==null) {
			instance = new EmployeeFactory();
		}
		return instance;
	}
	
	@Override
	public AbstractPersonAPI getObject() {
		// TODO Auto-generated method stub
		return new Employee("18,82,Q,L,50");
	}

}
