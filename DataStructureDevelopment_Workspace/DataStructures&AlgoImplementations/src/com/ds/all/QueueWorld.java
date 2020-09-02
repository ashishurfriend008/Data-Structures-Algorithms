package com.ds.all;

/*
 * Queue is a type of linked list where we keep two pointers one is front and another is rear.
Usually , the front points to the first node and rear points to the last node.
This linked list follows a certain pattern that is whenever you insert a element you basicaly insert at the end 
.And whenever you want to delete any element we usually use the front end.It is also called FIFO list i.e.the first
element inserted is the first one to be deleted.

While implementing a queue we used two list nodes by the fornt and rear.We insert using rear listnode and remove using
the front listnode.

When the queue is empty ,front = 0 , rear = 0 and length = 0.

When the queue has one element then both front and rear points to that particular element.

In order to insert a new node to a queue data as 15 , first will create a temporary list node 
which is having data as 15 and whose next will point to null.

Always in the queue , the node need to be inserted in the rear end.
 */

public class QueueWorld {
	
	private ListNode rear;
	private ListNode front;
	//This interger varialble will store the size of the queue.
	private int length;
	
	//Initializing the queue
	public QueueWorld(){
		this.front =  null;
		this.rear = null;
		this.length = 0;
				
	}
	
	/*
	 * Queue is basically a list , so internally it uses ListNodes.Here , we will create a inner class of 
	 * type List Node.
	 */
	private class ListNode{
		//In ListNode , we can keep two things i.e.one is the data part and other is the next list node.
		private int data;
		//Reference to next ListNode.
		private ListNode next;
		
		//Create constructor - This constructor will take in the data part.
		public ListNode(int data){
			this.data = data;
			this.next = null;
			}
	}

	//This method will return back the length of the queue.
	public int length(){
		return length;
	}
	/*
	 * This method will returns us a boolean value whether the queue is empty or not.
	 * If length is zero then this method will return us true otherwise false.
	 */
	public boolean isEmpty(){
		return length ==0;
	}
	
	//Insert elements in the queue
	public void enqueue(int data){
		//create the temporary ListNode
		ListNode temp = new ListNode(data);
		//check queue empty or not
		if(isEmpty()){
			front = temp;
		}else{
			//if queue is not empty
			rear.next = temp;
		}
		rear = temp;
		//incrementing the length by one.
		length ++;
	}
	
	//prints the elements of the queue
	public void printQueue(){
		
		//if the queue is empty
		if(isEmpty()){
			return;
		}
		/*
		 * If the queue is not empty - traverse all elements from the queue and print it accordingly.
		 * Initializing current to fornt
		 */
		ListNode current = front ;
		//traversing current till it becomes null.
		while(current != null){
			//printing the elements to the console.
			System.out.println(current.data + "-->");
			//positioning the current to its next position -  incrementing current to its next position
			current = current.next;
		}
		//After the current encounters the null value , simply printing null.
		System.out.println("null");
		
	}
    /*
     * Here , we saw queue has two ListNodes one is represent by front and other is represent by rear.
     */
	public static void main(String[] args) {
		
		//First create a instance of queue(Empty queue) - At first initialization , front , rear both points to null
		QueueWorld enqueue = new QueueWorld();
		enqueue.enqueue(10);
		enqueue.enqueue(15);
		enqueue.enqueue(20);
		
		enqueue.printQueue();
	}

}
