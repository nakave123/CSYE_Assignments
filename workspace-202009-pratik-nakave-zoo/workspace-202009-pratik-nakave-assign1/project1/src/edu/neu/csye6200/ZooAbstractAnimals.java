/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pnakave
 *
 */
public class ZooAbstractAnimals {
	
	public static void demo() {
		System.out.println("\n" + "-----------------------Abstract Class------------------------------");
		List<AbstractAnimalAPI> abstractAnimalsList = new ArrayList<AbstractAnimalAPI>();
		AbstractAnimalAPI elephantAbstract = new ElephantAbstract();
		AbstractAnimalAPI lionAbstract = new LionAbstract();
		AbstractAnimalAPI tigerAbstarct = new TigerAbstarct();
		abstractAnimalsList.add(elephantAbstract);
		abstractAnimalsList.add(lionAbstract);
		abstractAnimalsList.add(tigerAbstarct);
		for(AbstractAnimalAPI animal:abstractAnimalsList) {
			animal.speak();
			System.out.println(animal);
		}
	}

}
