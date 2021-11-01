/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class ServiceItemFactory implements ItemFactory {

	/*
	 * Implementing Singleton (Eager) Pattern
	 */
	private static final ServiceItemFactory instance = new ServiceItemFactory();

	private ServiceItemFactory() {}

	public static ServiceItemFactory getInstance() {
		return instance;
	}

	/*
	 * Implementing Factory Pattern
	 */
	@Override
	public Item getObject() {
		
		return new ServiceItem();
	}

}
