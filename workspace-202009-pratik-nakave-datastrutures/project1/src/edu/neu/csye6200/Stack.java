/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Stack {

	int[] arr;
	int capacity;
	int top;
	
	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return (top == capacity - 1);
	}

	public void push(int item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Inserting " + item + " into the stack");
		arr[++top] = item;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		System.out.println("Removing " + peek() + " from the stack");
		return arr[top--];
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(1); // ERROR
		}
		return -1;
	}

	
}
