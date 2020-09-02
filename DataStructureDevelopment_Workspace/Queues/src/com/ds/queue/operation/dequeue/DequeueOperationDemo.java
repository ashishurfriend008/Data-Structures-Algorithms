package com.ds.queue.operation.dequeue;

import java.util.NoSuchElementException;

public class DequeueOperationDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public DequeueOperationDemo(){
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length == 0;
	}
	
	public void enqueue(int data){
		ListNode temp = new ListNode(data);
		if(isEmpty()){
			front = temp;
		}else{
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public int dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is already empty");
		}
		int result = front.data;
		front = front.next;
		if(front == null){
			rear = null;
		}
		length--;
		return result;
		
	}
	
	public void print(){
		if(isEmpty()){
			return;
		}
		ListNode current = front;
		while(current != null){
			System.out.println(current.data+ "-->");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public int first(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is already empty");
		}
		return front.data;
	}
	
	public int last(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is already empty");
		}
		return rear.data;
	}
	
	public static void main(String[] args) {
		DequeueOperationDemo dequeueOperation = new DequeueOperationDemo();
		dequeueOperation.enqueue(15);
		dequeueOperation.enqueue(30);
		dequeueOperation.enqueue(45);
		
		System.out.println("First element in queue :- "+dequeueOperation.first());
		System.out.println("Last element in queue :- "+dequeueOperation.last());
		
		dequeueOperation.print();
		
		dequeueOperation.dequeue();
		dequeueOperation.dequeue();
		dequeueOperation.dequeue();
		dequeueOperation.dequeue();
		
		dequeueOperation.print();

	}

}


/*
 * Time complexity of dequeue method is O(1)

   Space complexity of dequeue method is O(1)
 */






