/**
 * 
 */
package edu.neu.csye6200;

import java.util.Comparator;
import java.util.List;

/**
 * @author pnakave
 *
 */
public abstract class AbstractStore {
	
	public abstract void sortItems();
	
	public abstract void demo();
	
	public abstract void printList(List<Item> itemsList);
	
	public class NameComparator implements Comparator<Item>{

		@Override
		public int compare(Item arg0, Item arg1) {
			return arg0.getName().compareToIgnoreCase(arg1.getName());
		}
	}
	
	public class IdComparator implements Comparator<Item>{

		@Override
		public int compare(Item arg0, Item arg1) {
			return Integer.compare(arg0.getId(), arg1.getId());
		}
	}
}
