/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pratiknakave
 *
 */
public class TwoAlternatingThreads {
	public static TwoAlternatingThreads twoAlternatingThreads = new TwoAlternatingThreads();
	Object sync = new Object();
	private boolean isSmall = false;
	
	public void printSmall(char i) {
		synchronized(sync) {									//Synchronizing
			while(true) {
				if(isSmall) {
					try {
						sync.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					System.out.print(i);
					isSmall = true;
					sync.notify();
					return;
				}
			}
		}
	}
	
	public void printBig(char i) {
		synchronized(sync) {
			while(true) {
				if(!isSmall) {
					try {
						sync.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					System.out.print(i);
					isSmall = false;
					sync.notify();
					return;
				}
			}
		}
	}
	
	public static void demo() {
		Runnable r1 = new Small();
		Thread small = new Thread(r1);
		Runnable r2 = new Big();
		Thread big = new Thread(r2);
		
		small.start();											//Starting the threads
		big.start();
	}

}

class Small implements Runnable{

	@Override
	public void run() {
		//Using ASCII values of a characters.
		for(int i=97;i<123;i++) {
			TwoAlternatingThreads.twoAlternatingThreads.printSmall((char)i);
		}
		
	}
	
}

class Big implements Runnable {

	@Override
	public void run() {
		for(int i=65;i<91;i++) {
			TwoAlternatingThreads.twoAlternatingThreads.printBig((char)i);
		}
		
	}
	
}
