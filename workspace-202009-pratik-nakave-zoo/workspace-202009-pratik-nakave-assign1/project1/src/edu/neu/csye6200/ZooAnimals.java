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
public class ZooAnimals {

	public static void demo() {	
		System.out.println("\n" + "-----------------------Concrete Class------------------------------");
		List<AnimalAPI> animalAPIList = new ArrayList<AnimalAPI>();
		AnimalAPI animalAPI = new AnimalAPI();
		System.out.println(animalAPI);
		AnimalAPI elephant = new Elephant();
		AnimalAPI lion = new Lion();
		AnimalAPI tiger = new Tiger();
		animalAPIList.add(elephant);
		animalAPIList.add(lion);
		animalAPIList.add(tiger);
		for(AnimalAPI animal:animalAPIList) {
			animal.speak();
			System.out.println(animal);
		}
	}
	
}
