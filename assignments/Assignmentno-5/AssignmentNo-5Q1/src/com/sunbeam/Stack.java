package com.sunbeam;

public class Stack 
{
	    private Node top;

	   
	    private class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	   
	    public Stack() {
	        this.top = null;
	    }

	  
	    public void push(int data) {
	        Node newNode = new Node(data);
	        if (top == null) {
	            top = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	    }

	   
	    public int pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1; 
	        } else {
	            int data = top.data;
	            top = top.next;
	            return data;
	        }
	    }

	   
	    public int peek() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1; 
	        } else {
	            return top.data;
	        }
	    }

	   
	    public boolean isEmpty() {
	        return top == null;
	    }

	   
	    public void printStack() {
	        Node current = top;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        
	        System.out.println("Stack elements:");
	        stack.printStack();

	        System.out.println("Top element is " + stack.peek());
	        System.out.println("Popped element is " + stack.pop());
	        System.out.println("Top element after pop is " + stack.peek());
	        System.out.println("Stack elements after pop:");
	        stack.printStack();
	        
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
	}



