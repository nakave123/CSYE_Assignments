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
		System.out.println("Driver started execution here...");

		System.out.println("---------Static integer Queue---------");
		Queue queue = new Queue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("Front of the Queue: "+queue.peek());
		System.out.println("Size of the Queue: "+queue.size());
		
		System.out.println("---------Static integer Stack---------");
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.pop();
		
		System.out.println("Top of the stack: "+stack.peek());
		System.out.println("Size of the stack: "+stack.size());
		
		System.out.println("---------Generic Queue---------");
		String[] t = new String[5];
		GenericQueue<String> gQueue = new GenericQueue<String>(t);
		gQueue.enqueue("a");
		gQueue.enqueue("b");
		gQueue.enqueue("c");
		
		gQueue.dequeue();
		System.out.println("Front of the Queue: "+gQueue.peek());
		System.out.println("Size of the Queue: "+gQueue.size());
		
		System.out.println("---------Generic Stack---------");
		String[] arr = new String[3];
		GenericStack<String> gStack = new GenericStack<String>(arr);
		gStack.push("C");
		gStack.push("B");
		gStack.push("A");
		
		gStack.pop();
		System.out.println("Top of the stack: "+gStack.peek());
		System.out.println("Size of the stack: "+gStack.size());
		
		System.out.println("Driver finished execution here...");
	}
	
/*
=====================OUTPUT=====================
Driver started execution here...
---------Static integer Queue---------
Adding 1 to the queue
Adding 2 to the queue
Adding 3 to the queue
Adding 4 to the queue
Adding 5 to the queue
Removing 1 from the queue
Removing 2 from the queue
Front of the Queue: 3
Size of the Queue: 3
---------Static integer Stack---------
Inserting 1 into the stack
Inserting 2 into the stack
Inserting 3 into the stack
Inserting 4 into the stack
Inserting 5 into the stack
Removing 5 from the stack
Top of the stack: 4
Size of the stack: 4
---------Generic Queue---------
Adding a to the queue
Adding b to the queue
Adding c to the queue
Removing a from the queue
Front of the Queue: b
Size of the Queue: 2
---------Generic Stack---------
Inserting C to the stack
Inserting B to the stack
Inserting A to the stack
Removing A from the stack
Top of the stack: B
Size of the stack: 2
Driver finished execution here...
*/

}
