package com.ds.stack.representation.pop;

import java.util.EmptyStackException;

import com.ds.stack.representation.push.StackPushDemo;

public class StackPopDemo {

	/**
	 * @Ashish Ku.Dey
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
	public StackPopDemo(){
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
	
	/*
	 * This method returns the value of last inserted node into the Stack
	 */
	public int pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
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
	
	public void push(int data){
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public static void main(String[] args) {
		StackPopDemo stackPop = new StackPopDemo();
		stackPop.push(10);
		stackPop.push(15);
		stackPop.push(20);
		
		System.out.println(stackPop.peek());
		stackPop.pop();
		System.out.println(stackPop.peek());
		stackPop.pop();
		System.out.println(stackPop.peek());
		

	}

}
