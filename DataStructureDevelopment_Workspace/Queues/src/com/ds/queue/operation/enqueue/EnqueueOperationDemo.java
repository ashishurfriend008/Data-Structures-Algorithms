package com.ds.queue.operation.enqueue;

public class EnqueueOperationDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public EnqueueOperationDemo(){
		this.front = null;
		this.rear  = null;
		this.length = 0;
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
	
	public void printEnqueueListNode(){
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
	
	public static void main(String[] args) {
		EnqueueOperationDemo enqueueOperation = new EnqueueOperationDemo();
		enqueueOperation.enqueue(10);
		enqueueOperation.enqueue(20);
		enqueueOperation.enqueue(30);
		enqueueOperation.printEnqueueListNode();

	}

}


/*
 * Time complexity of enqueue method is O(1)

   Space complexity of enqueue method is O(1)
 */











