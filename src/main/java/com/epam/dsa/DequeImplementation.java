package com.epam.dsa;

public class DequeImplementation {
	
	public static void main(String[] args) {

		Deque deque = new Deque(10);

		System.out.println("Inserting 20 at rear");
		deque.insertRear(20);
		
		System.out.println("Inserting 15 at front");
		deque.insertFront(15);

		System.out.println("Inserting 10 at rear");
		deque.insertRear(10);
		
		System.out.println("Inserting 25 at front");
		deque.insertFront(25);

		System.out.println("Rear = " + deque.getRear());
		
		System.out.println("Front = " + deque.getFront());
		
		System.out.println("Deleting rear = " + deque.getRear());
		deque.deleteRear();
		System.out.println("New rear = " + deque.getRear());
		
		System.out.println("Deleting front = " + deque.getFront());
		deque.deleteFront();
		System.out.println("New front = " + deque.getFront());
	}
}

class Deque {
	
	int arr[];
	int front;
	int rear;
	int size;

	public Deque(int size) {
		arr = new int[size];
		front = -1;
		rear = 0;
		this.size = size;
	}
	
	boolean isFull() {
		return ((front == 0 && rear == size - 1) || front == rear + 1);
	}

	boolean isEmpty() { 
		return (front == -1); 
	}

	void insertFront(int key) {
		
		if (isFull()) {
			System.out.println("Queue Overflow");
			return;
		}

		if (front == -1) {
			front = 0;
			rear = 0;
		}
		else if (front == 0) {
			front = size - 1;
		}
		else {
			front = front - 1;
		}
		
		arr[front] = key;
	}

	void insertRear(int key) {
		
		if (isFull()) {
			System.out.println("Queue Overflow");
			return;
		}

		if (front == -1) {
			front = 0;
			rear = 0;
		}
		else if (rear == size - 1) {
			rear = 0;
		}
		else {
			rear = rear + 1;
		}
		
		arr[rear] = key;
	}

	void deleteFront() {
		
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}

		if (front == rear) {
			front = -1;
			rear = -1;
		}
		else if (front == size - 1) {
			front = 0;
		}
		else {
			front = front + 1;
		}
	}

	void deleteRear() {
		
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}

		if (front == rear) {
			front = -1;
			rear = -1;
		}
		else if (rear == 0) {
			rear = size - 1;
		}
		else {
			rear = rear - 1;
		}	
	}

	int getFront() {
		
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		
		return arr[front];
	}

	int getRear() {
		
		if (isEmpty() || rear < 0) {
			System.out.println("Queue Underflow");
			return -1;
		}
		
		return arr[rear];
	}
}

