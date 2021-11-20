/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class GenericStack<T> {

	T[] arr;
	int capacity;
	int top;
	
	public GenericStack(T[] t) {
		arr = t;
		capacity = t.length;
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

	public void push(T item) {
		if (isFull()) {
			System.exit(1); // ERROR
		}
		System.out.println("Inserting " + item + " to the stack");
		arr[++top] = item;
	}
	
	public T pop() {
		if (isEmpty()) {
			System.exit(1); // ERROR
		}
		System.out.println("Removing " + peek() + " from the stack");
		return arr[top--];
	}

	public T peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(1); // ERROR
		}
		return null;
	}
}
