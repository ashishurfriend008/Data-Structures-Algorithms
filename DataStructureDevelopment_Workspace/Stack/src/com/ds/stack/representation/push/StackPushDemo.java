package com.ds.stack.representation.push;

import java.util.EmptyStackException;

public class StackPushDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private ListNode top;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	/*
	 * Once Stack is initialized we know that top points to null
	 * and length is zero.
	 */
	public StackPushDemo(){
		top = null;
		length = 0;
	}
	
	//length of the Stack
	public int length(){
		return length;
	}
	
	/*
	 * return true or false whether Stack is empty or not.
	 * If length is zero than Stack is empty and if length
	 * is not zero than Stack returns false.
	 */
	public boolean isEmpty(){
		return length == 0;
	}
	
	public void push(int data){
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	/*
	 * It return us the value which top holds
	 * Returning value of a last inserted node into the Stack. 
	 */
	public int peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		StackPushDemo pushStack = new StackPushDemo();
		pushStack.push(10);
		pushStack.push(15);
		pushStack.push(20);
		
		System.out.println(pushStack.peek());
		
		
		

	}

}
