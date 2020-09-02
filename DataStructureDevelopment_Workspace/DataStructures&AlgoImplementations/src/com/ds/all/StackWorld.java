package com.ds.all;

import java.util.EmptyStackException;

/*
 * Stack 
-----
Stack is a linear data staructure used for storing the data.

We called stack as linear data structure because it can be represented by linked list or an array in which the
nodes are adjacent with each other.

The basic property of stack is that its an ordered list in which we insert and delete the nodes at one end.

Initially when stack is empty , then the top node points to null and usually we use PUSH and POP operations to 
add and remove elements.

The moment the node is pushed in the stack the pointer points to that particular element.

The stack is basically a one way list.Because we are inserting element at one end and the other end is blocked.
There is only one end in the stack to push and pop the element.

If we want to pop an element then the pointer will points to the node just before it.

If there is no node left in the stack then the pointer points to null.
 */

/*
 * Here , we will implement  stack using linked list
 */

public class StackWorld {
	
	private ListNode top;
	
	//It will store the size of the stack
	private int length;
	
	//inner class of type ListNode
	private class ListNode{
		private int data;
		//pointer to next node
		private ListNode next;
		
		//create constructor which takes the data
		public ListNode(int data){
			this.data = data;
		}
	}
	/*
	 * Once we initialize the stack we know that top points to null and length 
	 * is zero. 
	 * Create one constructor for the stack class and assign null to top and length
	 * as zero.
	 */
	public StackWorld(){ 
		top = null;
		length = 0;
	}
	
	/*
	 * Method which will return us back the length of the stack.
	 */
	public int length(){
		return length;
	}
	/*
	 * Create a boolean method by name isEmpty which will return the boolean value
	 * whether the stack is empty or not.
	 * In order to know stack is empty will simply check Length is zero or not ,  If 
	 * length is zero , will simply returns true then stack is empty and if the length
	 * is not zero then will simply returns  value of false that stack is not empty.
	 */
	public boolean isEmpty(){
		return length == 0 ;
	}
	
	/*
	 * Push Method
	 */
	public void push(int data){
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	/*
	 * Pop Method - It will return us back the value of last inserted node 
	 * into the stack.
	 */
	public int pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		/*
		 * Finally , top is moved to next node.That node will be garbage collected.
		 * Then , we can simply reduce the length of the stack by one and finally
		 * return result.
		 */
		length --;
		return result; 	 	
	}

	/*
	 * Peak Method - It returns us back the value which top holds.
	 */
	public int peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		/*
		 * top is the last inserted node in the stack - will get that value 
		 * stored in that particular list node.
		 */
		return top.data;
	}
	public static void main(String[] args) {
		
		//demonstration of these above methods
		StackWorld stack = new StackWorld();
		
		//push few elements into the Stack 
		stack.push(10);
		stack.push(15);
		stack.push(20);
		
		//Always in stack top points to the last inserted node which will print 20
		System.out.println(stack.peek());
		
		stack.pop();
		
		System.out.println(stack.peek());

		stack.pop();
		
		System.out.println(stack.peek());


	}

}
