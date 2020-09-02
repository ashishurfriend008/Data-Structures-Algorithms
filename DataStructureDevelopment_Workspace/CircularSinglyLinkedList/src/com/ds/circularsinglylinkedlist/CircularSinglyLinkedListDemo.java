package com.ds.circularsinglylinkedlist;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedListDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data){
			this.data = data;
		}
	}
	
	public CircularSinglyLinkedListDemo(){
				last = null;
				length = 0;
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
			return length ==0;
	}
	
	public void createCircularLinkedList(){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	//traverse and print a circular linked list
	public void display(){
		if(last == null){
			return;
		}
		
		ListNode first = last.next;
		while(first != last){
			System.out.println(first.data + "-->");
			first = first.next;
		}
		System.out.println(first.data);
	}
	
	//insert a node at the beginning of circular singly linked list
	public void insertFirst(int data){
		ListNode temp = new ListNode(data);
		
		if(last == null){
			last = temp;
		}else{
		temp.next = last.next;
		}
		last.next = temp;
		length++;
	}
	
	//insert a node at the end of circular singly linked list
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
	
	//remove first node from circular singly linked list
	public ListNode removeFirst(){
		if(isEmpty()){
			throw new NoSuchElementException("Circular singly linked list is already empty");
		}
		
		ListNode temp = last.next;
		if(last.next == last){
			last = null;
			
		}else{
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedListDemo circularll = new CircularSinglyLinkedListDemo();
		circularll.createCircularLinkedList();
		circularll.display();
		System.out.println("-----------------------------------------");
		CircularSinglyLinkedListDemo circularll1 = new CircularSinglyLinkedListDemo();
		circularll1.insertFirst(10);
		circularll1.insertFirst(15);
		circularll1.insertFirst(25);
		circularll1.display();
		System.out.println("-----------------------------------------");
		CircularSinglyLinkedListDemo circularll2 = new CircularSinglyLinkedListDemo();
		circularll2.insertFirst(30);
		circularll2.insertFirst(40);
		circularll2.insertFirst(50);
		circularll2.display();
		System.out.println("-----------------------------------------");
		CircularSinglyLinkedListDemo circularll3 = new CircularSinglyLinkedListDemo();
		circularll3.insertFirst(100);
		circularll3.insertFirst(200);
		circularll3.insertFirst(300);
	//	circularll3.display();
		circularll3.removeFirst();
		circularll3.removeFirst();
		circularll3.display();
		System.out.println("-----------------------------------------");
		
		

	}

}

/*
 * Time complexity of display method is O(n)

   Space complexity of display method is O(1)
   
   Time complexity of insertFirst method is O(1)

   Space complexity of insertFirst method is O(1)
   
   Time complexity of insertLast method is O(1)

   Space complexity of insertLast method is O(1)
   
   Time complexity of removeFirst method is O(1)

   Space complexity of removeFirst method is O(1)
 */

















