/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Driver started execution from here...");

		ZooAnimals.demo();
		ZooAnamilisticAPI.demo();
		ZooAbstractAnimals.demo();
		
		System.out.println("\n" + "Driver finished execution here...");

	}
	
	
/**
 * 
--------------------------OUTPUT-----------------------------------
Driver started execution from here...

-----------------------Concrete Class------------------------------
AnimalAPI is deriving 3 animals
I am an Elephant extending AnimalAPI
Elephant extending AnimalAPI called toString()
I am a Lion extending AnimalAPI
Lion extending AnimalAPI called toString()
I am a Tiger extending AnimalAPI
Tiger extending AnimalAPI called toString()

-----------------------Interface Implementation------------------------------
I am an ElephantImpl implementing AnimalisticAPI
ElephantImpl implementing AnimalisticAPI called toString()
I am LionImpl implementing AnimalisticAPI
LionImpl implementing AnimalisticAPI called toString()
I am TigerImpl implementing AnimalisticAPI
TigerImpl implementing AnimalisticAPI called toString()

-----------------------Abstract Class------------------------------
I am an ElephantAbstract extending AbstractAnimalAPI
ElephantAbstract extending AbstractAnimalAPI called toString()
I am LionAbstract extending AbstractAnimalAPI
LionAbstract extending AbstractAnimalAPI called toString()
I am TigerAbstarct extending from AbstractAnimalAPI
TigerAbstarct extending from AbstractAnimalAPI called toString()

Driver finished execution here...

 */
	
	
}
