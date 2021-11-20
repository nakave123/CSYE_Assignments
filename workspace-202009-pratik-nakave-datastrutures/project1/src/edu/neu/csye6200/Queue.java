/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Queue{
	// elements in Queue
	int[] arr;
	int capacity;
	int front;
	int rear;
	int count;
	
	public Queue(int size) {
		arr = new int[size];
		capacity = size; // Max size
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


	public void enqueue(int item) {
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

	public int peek() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		return arr[front];
	}

}

