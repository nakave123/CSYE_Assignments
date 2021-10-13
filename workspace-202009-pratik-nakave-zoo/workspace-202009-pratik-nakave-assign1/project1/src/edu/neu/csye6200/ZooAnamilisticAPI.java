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
public class ZooAnamilisticAPI {

	public static void demo() {	
		System.out.println("\n" + "-----------------------Interface Implementation------------------------------");
		List<AnimalisticAPI> anamalisticAPIList = new ArrayList<AnimalisticAPI>();
		AnimalisticAPI elephantImpl = new ElephantImpl();
		AnimalisticAPI lionImpl = new LionImpl();
		AnimalisticAPI tigerImpl = new TigerImpl();
		anamalisticAPIList.add(elephantImpl);
		anamalisticAPIList.add(lionImpl);
		anamalisticAPIList.add(tigerImpl);
		for(AnimalisticAPI animal:anamalisticAPIList) {
			animal.speak();
			System.out.println(animal);
		}
	}
}
