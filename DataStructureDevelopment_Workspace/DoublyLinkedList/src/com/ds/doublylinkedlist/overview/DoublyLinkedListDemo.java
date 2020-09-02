package com.ds.doublylinkedlist.overview;

import java.util.NoSuchElementException;

public class DoublyLinkedListDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data){
			this.data = data;
		}
	}
	
	public DoublyLinkedListDemo(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty(){
		return length == 0;
	}
	
	public int length(){
		return length;
	}
	
	//insert node at the end of doubly linked list
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()){
			head = newNode;
		}else{
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	
	//insert node at the beginning of doubly linked list
	public void insertBegining(int value){
		ListNode newNode = new ListNode(value);
		
		if(isEmpty()){
			tail = newNode;
		}else{
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	//print elements in the forward direction of doubly linked list
	public void displayForward(){
		if(head == null){
			return;
		}
		
		ListNode temp = head;
		
		while(temp != null){
			System.out.println(temp.data +" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	//print elements in the backward direction of doubly linked list
	public void displayBackward(){
		if(tail == null){
			return;
		}
		
		ListNode temp = tail;
		
		while(temp != null){
			System.out.println(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	//delete first node in doubly linked list
	public ListNode deleteFirst(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		if(head == tail){
			tail = null;
		}else{
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;	
	}
	
	//delete last node in doubly linked list
	public ListNode deleteLast(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		
		ListNode temp = tail;
		if(tail == head){
			head = null;
		}else{
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		DoublyLinkedListDemo dll = new DoublyLinkedListDemo();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		
		dll.displayForward();
		System.out.println("----------------------------------------");
		dll.displayBackward();
		System.out.println("----------------------------------------");
		
		DoublyLinkedListDemo dll1 = new DoublyLinkedListDemo();
		dll1.insertBegining(1);
		dll1.insertBegining(10);
		
		dll1.displayForward();
		System.out.println("----------------------------------------");
		dll1.displayBackward();
		System.out.println("----------------------------------------");
		
		DoublyLinkedListDemo dll2 = new DoublyLinkedListDemo();
		dll2.insertLast(1);
		dll2.insertLast(2);
		dll2.insertLast(3);
		
		dll2.deleteFirst();
		dll2.deleteFirst();
		dll2.displayForward();
		System.out.println("----------------------------------------");
		
		DoublyLinkedListDemo dll3 = new DoublyLinkedListDemo();
		dll3.insertLast(4);
		dll3.insertLast(5);
		dll3.insertLast(6);
		
		dll3.deleteLast();
		dll3.deleteLast();
		dll3.displayForward();
		System.out.println("----------------------------------------");
		
		
		
		
		

	}

}


/*
 * Time complexity of displayForward and displayBackward is O(n)

   Space complexity of displayForward and displayBackward is O(n)
   
   Time complexity of insertEnd method is O(1)

   Space complexity of insertEnd method is O(1)
   
   Time complexity of deleteFirst method is O(1)

   Space complexity of deleteFirst method is O(1)
   
   Time complexity of deleteLast method is O(1)

   Space complexity of deleteLast method is O(1)
 */














