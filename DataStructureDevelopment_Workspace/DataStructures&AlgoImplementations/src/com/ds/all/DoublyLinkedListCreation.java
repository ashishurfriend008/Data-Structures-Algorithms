package com.ds.all;

import java.util.NoSuchElementException;

public class DoublyLinkedListCreation {
	
	/*
	 * Doubly LibkedList do have head and tail pointers.
	 * Head will hold the first node of doubly linked list
	 * and tail will hold the last node of doubly linked list.
	 */
	private ListNode head;
	private ListNode tail;
	/*
	 * interger value hold the length of doubly linked list - return the count
	 * of number of nodes in doubly linked  list.
	 */
	private int length;
	
	
	//Implementation starts here;inner class - This class holds pointers to next and previous nodes. 
	private class ListNode{
		
		//holds the data
		private int data;
		
		//pointer to next
		private ListNode next;
		
		//pointer to previous
		private ListNode previous;
		
		public ListNode(int data){
			this.data = data;
		}
	}
	
	/*
	 * constructor of doubly linked list class - assign the values of these
	 * three instance variables.
	 * Initially , when we initialized doubly linked list the list is empty , 
	 * so the head and tail will point to null and length of doubly linked list 
	 * is zero.   
	 */
	public DoublyLinkedListCreation(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	/*
	 * method which signifies the doubly linked list is empty or not.
	 * Suppose , the list of doubly linked list is zero , therefore 
	 * the list is empty , so it will return true.
	 * Even if the head == null the list is empty.
	 */
	public boolean isEmpty(){
		return length == 0;
	}
	
	/*
	 * Return back length of doubly linked list
	 */
	public int length(){
		return length;
	}
	
	//print elements in doubly linked list in forward direction
	public void displayForward(){
		if(head == null){
			return ;
		}
		
		ListNode temp = head;
		while(temp != null){
			System.out.println(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	//print elements in doubly linked list in backward direction
	public void displayBackward(){
		if(tail ==  null){
			return;
		}
		
		ListNode temp = tail;
		while(temp != null){
			System.out.println(temp.data +"-->");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	public void insertFirst(int value){
		ListNode newNode = new ListNode(value);
		if(isEmpty()){
			tail = newNode;
		}else{
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		//After insert the node at the begining of doubly linked list , simply incerment length by one
		length++;
	}
	
	/*
	 * Insert Node At The End Of Doubly Linked List - Usually the manupulation will 
	 * occur at the tail pointer of doubly linked list.
	 * When the list is empty the head pointer comes into picture.When list is empty
	 * both head and tail points to null.After we insert a node at the end of doubly 
	 * linked list , so the list contains only one node.Therefore , the head and tail
	 * both needs to points to that particular node.In this function we need to cover
	 * that case when the list is empty. 
	 */
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		if(isEmpty()){
			head = newNode;
		}else{
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		//Finally , increment the doubly linked list by one.
		length++;
	}
	
	/*
	 * Delete First Node In Doubly Linked List.
	 * The only place tail node comes into picture when head is equal to tail i.e.
	 * the doubly linked list has only one node and both head and tail points to it.
	 */
	public ListNode deleteFirst(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode tmp = head;
		//head == tail this means doubly linked list has only one node.
		if(head == tail){
			tail = null;
		}else{
			head.next.previous = null;
		}
		head = head.next;
		tmp.next = null;
		//Here , size of length is reduced by one.
		length--;
		//this tmp node is pointing to the first node of linked list.
		return tmp;
	}
	
	/*
	 * Delete Last Node In Doubly Linked List.
	 * 
	 */
	public ListNode deleteLast(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
			
			ListNode temp = tail;
			/*
			 * if head == tail , then there is only one node left in DLL.
			 * In order to break both the reference to free that node , so
			 * will simply assign a null value to head.
			 */
			if(head == tail){
				head = null;
			}else{
				tail.previous.next = null;
			}
			
			tail = tail.previous;
			temp.previous = null;
			/*
			 * We need to reduce the length of DDL by one.
			 * Therefore , decrementing length by one.
			 */
			return temp;
		}
 
	public static void main(String[] args) {
		DoublyLinkedListCreation dll = new DoublyLinkedListCreation();
		
		dll.insertFirst(1);
		dll.insertFirst(2);
		dll.insertFirst(3);
		/*
		dll.insertLast(10);
		dll.insertLast(15);
		
		dll.displayForward();
		dll.displayBackward();
		*/
		/*
		dll.displayForward();
		System.out.println("*************************************");
		dll.deleteFirst();
		dll.displayForward();
		System.out.println("*************************************");
		dll.deleteFirst();
		dll.displayForward();
		System.out.println("*************************************");
		dll.deleteFirst();
		dll.displayForward();      
		System.out.println("*************************************");
		dll.deleteFirst();
		dll.displayForward();
		*/
		dll.displayForward();
		dll.deleteLast();
		dll.deleteLast();
		dll.deleteLast();
		dll.displayForward();
		
		

	}

}
