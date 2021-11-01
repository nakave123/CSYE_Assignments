/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class ElectronicItemFactory implements ItemFactory {
	/*
	 * Implementing Singleton (Lazy) Pattern
	 */
	private static ElectronicItemFactory instance;

	private ElectronicItemFactory() {
		
	}

	public static synchronized ElectronicItemFactory getInstance() {
		if (instance == null) {
			instance = new ElectronicItemFactory();
		}
		
		return instance;
	}
	
	/*
	 * Implementing Factory Pattern
	 */
	@Override
	public Item getObject() {
		
		return new ElectronicItem();
	}

}
