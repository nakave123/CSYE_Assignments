/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class GenericQueue<T> {

	// elements in Queue
	T[] arr;
	int capacity;
	int front;
	int rear;
	int count;
	
	public GenericQueue(T[] t){
		arr = t;
		capacity = t.length; // Max size
		front = 0;
		rear = -1;
		count = 0; 
	}
	
	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public boolean isFull() {
		return (size() == capacity);
	}


	public void enqueue(T item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Adding " + item + " to the queue");
		rear = (rear + 1) % capacity; // circular index
		arr[rear] = item;
		count++;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		System.out.println("Removing " + arr[front] + " from the queue");
		front = (front + 1) % capacity; // circular index
		count--;
	}

	public T peek() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		return arr[front];
	}

}
