/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class FoodItemFactory implements ItemFactory {

	@Override
	public Item getObject() {
		
		return new FoodItem();
	}

}
