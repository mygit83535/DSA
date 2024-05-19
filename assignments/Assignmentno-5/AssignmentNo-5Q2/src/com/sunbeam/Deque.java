package com.sunbeam;

public class Deque 
{
	
	    private Node head;
	    private Node tail;

	   
	    private class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	            this.prev = null;
	        }
	    }

	   
	    public Deque() {
	        this.head = null;
	        this.tail = null;
	    }

	   
	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	   
	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            head = tail = newNode;
	        } else {
	            newNode.prev = tail;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	   
	    public int removeFirst() {
	        if (head == null) {
	            System.out.println("Deque is empty");
	            return -1;
	        } else {
	            int data = head.data;
	            head = head.next;
	            if (head != null) {
	                head.prev = null;
	            } else {
	                tail = null;
	            }
	            return data;
	        }
	    }

	   
	    public int removeLast() {
	        if (tail == null) {
	            System.out.println("Deque is empty");
	            return -1; 
	        } else {
	            int data = tail.data;
	            tail = tail.prev;
	            if (tail != null) {
	                tail.next = null;
	            } else {
	                head = null;
	            }
	            return data;
	        }
	    }

	   
	    public boolean isEmpty() {
	        return head == null;
	    }

	  
	    public void printDeque() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	     public static void main(String[] args) {
	        Deque deque = new Deque();
	        
	        deque.addFirst(10);
	        deque.addLast(20);
	        deque.addFirst(5);
	        deque.addLast(30);

	        System.out.println("Deque elements from front to end:");
	        deque.printDeque();

	        
	        System.out.println("Removed first element: " + deque.removeFirst());
	        System.out.println("Removed last element: " + deque.removeLast());

	        System.out.println("Deque elements after removals:");
	        deque.printDeque();

	        System.out.println("Is deque empty? " + deque.isEmpty());
	    }
	}



