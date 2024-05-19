package com.sunbeam;

public class LinearQueue 
{

	    private int maxSize;
	    private int[] queueArray;
	    private int front;
	    private int rear;

	    public LinearQueue(int size) {
	        maxSize = size;
	        queueArray = new int[maxSize];
	        front = 0;
	        rear = 0;
	    }

	    public void enqueue(int data) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue " + data);
	        } else {
	            queueArray[rear] = data;
	            rear = (rear + 1) % maxSize;
	            System.out.println("Enqueued: " + data);
	        }
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1; // Return -1 to indicate queue underflow
	        } else {
	            int data = queueArray[front];
	            front = (front + 1) % maxSize;
	            return data;
	        }
	    }

	    public boolean isEmpty() {
	        return front == rear;
	    }

	    public boolean isFull() {
	        return (rear + 1) % maxSize == front;
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Queue: ");
	        int i = front;
	        while (i != rear) {
	            System.out.print(queueArray[i] + " ");
	            i = (i + 1) % maxSize;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        LinearQueue queue = new LinearQueue(5);
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        queue.display();

	        System.out.println("Dequeued: " + queue.dequeue());
	        System.out.println("Dequeued: " + queue.dequeue());
	        System.out.println("Dequeued: " + queue.dequeue());

	        queue.display();

	        queue.enqueue(60);
	        queue.enqueue(70);

	        queue.display();
	    }
	}

	

