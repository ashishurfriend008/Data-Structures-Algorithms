package com.ds.all;

/*
 * When last is point to null then there are no nodes in circular singly linked list.
 */

public class CircularSinglyLinkedList {
	
	/*
	 * This ListNode will help us to track last node of circular singly linked
	 * list
	 */
	private ListNode last;
	
	/*
	 * This length variable will hold the size of the circular singly linked list
	 */
	private int length;
	
	private class ListNode{
		//Reference to next ListNode
		private ListNode next;
		//Contains the data part
		private int data;
		
		public ListNode(int data){
			this.data = data;
		}
	}
	
	//Constructor of CircularLinkedList
	public CircularSinglyLinkedList(){
		/*
		 * When we initialize circular singly linked list , last points to null.
		 * As the list is empty , so the length is zero.
		 */
		last = null;
		length = 0;
	}
	
	/*
	 * When we call this method then it will return the size of circular singly 
	 * linked list
	 */
	public int length(){
		return length;
	}
	/*
	 * When we call this method then it will return us back whether the circular 
	 * linked list is empty or not.
	 */
	public boolean isEmpty(){
		/*
		 * When length is zero return true and when length is not zero the  simply
		 * return false.
		 */
		return length == 0;
	}
	/*
	 * Creation of circular singly linked list
	 */
	public void circularSinglyLinkedList(){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);
		ListNode fifth = new ListNode(20);
		
		//interconnect all nodes which will make circular in nature
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = first;
		
		last = fifth;
	}
	
	/*
	 * Traverse each and every element in circular singly linked list and 
	 * print the data of respective node.
	 */
	public void display(){
		if(last == null){
			return;
		}
		ListNode first = last.next;
		while(first != last){
			System.out.println(first.data +" , ");
			first = first.next;
		}
		System.out.println(first.data);
	}
	
	/*
	 * Insert a node at the begining of circular singly linked list
	 */
	public void insertFirst(int data){
		ListNode temp = new ListNode(data);
		//if circular singly linked list is empty
		if(last == null){
			last = temp;
		}else{
			temp.next = last.next;
		}
		    last.next = temp;
		    length++;
	}
	
	/*
	 * Method to insert node at the end of circular linked list
	 */
	public void insertLast(int data){
		ListNode temp = new ListNode(data);
		if(last == null){
			last = temp;
			last.next = last;
		}else{
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}

	public static void main(String[] args) {
		
		CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
		/*
		circularSinglyLinkedList.circularSinglyLinkedList();
		//circularSinglyLinkedList.display();
		circularSinglyLinkedList.insertFirst(30);
		circularSinglyLinkedList.insertFirst(40);
		circularSinglyLinkedList.insertFirst(50);
		circularSinglyLinkedList.display();
		*/
		circularSinglyLinkedList.insertLast(1);
		circularSinglyLinkedList.insertLast(10);
		circularSinglyLinkedList.insertLast(20);
		circularSinglyLinkedList.insertLast(30);
		circularSinglyLinkedList.insertLast(40);
		circularSinglyLinkedList.display();
		
		
		
		 
	}

}
