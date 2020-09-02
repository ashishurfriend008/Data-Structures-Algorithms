package com.ds.singlylinkedlist.representation;

public class SinglyLinkedListDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	private static ListNode head;
	
	//creation of singly linked list
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	//Print elements of singly linked list
	public void display(){
		ListNode current = head;
		while(current != null){
			System.out.println(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	//Find length of singly linked list
	public int length(){
		if(head == null){
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	//insert node at the beginning of singly linked list
	public void insertFirst(int value){
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	//insert node at the end of singly linked list
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		
		if(head == null){
			head = newNode;
			return;		
		}
		
		ListNode current = head;
		while(null != current.next){
			current = current.next;
		}
		
		current.next = newNode;
	}
	
	//search an element in singly linked list
	public boolean find(ListNode head, int searchKey){
		if(head == null){
			return false;
		}
		
		ListNode current = head;
		while(current != null){
			if(current.data == searchKey){
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	//reverse a singly linked list
	public ListNode reverse(){
		if(head == null){
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		if(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
		
	}
	
	//Find middle node in singly linked list
	public ListNode getMiddleNode(){
		if(head == null){
			return null;
		}
		
		ListNode slwPtr = head;
		ListNode fstPtr = head;
		
		while(fstPtr != null && fstPtr.next != null){
			
			//traverse slwPtr by one node
			slwPtr = slwPtr.next;
			//traverse fstPtr by two nodes
			fstPtr = fstPtr.next.next;
		}
		//slwPtr will be pointing to the middle node
		return slwPtr;
	}
	
	//Find nth node from the end in singly linked list
	public ListNode getNthNodeFromEnd(int n){
		if(head == null){
			return null;
		}
		
		if(n<=0){
			throw new IllegalArgumentException("Invalid value :-"+n);
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		
		while(count < n){
			if(refPtr == null){
				System.out.println(n+ "is greater than the number of nodes in list ");
			}
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr != null){
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	//Remove duplicates from sorted singly linked list
	public void removeDuplicates(){
		if(head == null){
			return;
		}
		
		ListNode current = head;
		
		while(current != null && current.next != null){
			//check adjacent nodes are duplicates or not
			if(current.data == current.next.data){
				current.next = current.next.next;
			}else{
				//if the adjacent nodes are not same
				current = current.next;
			}
		}
	}
	
	//Insert a node in a sorted singly linked list
	public ListNode insertInSortedList(int value){
		ListNode newNode = new ListNode(value);
		
		if(head == null){
			return newNode;
		}
		
		ListNode current = head;
		ListNode temp = null;
		
		while(current != null && current.data < newNode.data ){
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
		return head;
		
	}
	
	//remove a given key from singly linked list
	public void deleteNode(int key){
		ListNode current = head;
		ListNode temp = null;
		
		if(current != null && current.data == key){
			head = current.next;
			return;
		}
		
		while(current != null && current.data != key){
			temp = current;
			current = current.next;
		}
		
		if(current == null){
			return;
		}
		
		temp.next = current.next;
	}
	
	//Detect loop in singly linked list
	public boolean detectLoop(){
		ListNode fstPtr = head;
		ListNode slwPtr = head;
		
		while(fstPtr != null && fstPtr.next != null){
			fstPtr = fstPtr.next.next;
			slwPtr = slwPtr.next;
			
			if(slwPtr == fstPtr){
				return true;
			}
		}
		
		return false;
	}
	
	//create loop in linked list
	public void createALoopInLinkedList(){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	public static void main(String[] args) {
		SinglyLinkedListDemo sll = new SinglyLinkedListDemo();
		
		sll.head = new ListNode(10);
		ListNode second = new ListNode(15);
		ListNode third = new ListNode(20);
		ListNode fourth = new ListNode(25);
		ListNode fifth = new ListNode(25);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		
		sll.display();
		
		System.out.println("------------------------------------------");
		
		sll.createALoopInLinkedList();
		System.out.println(sll.detectLoop());
		
		System.out.println("------------------------------------------");
//		
//		sll.deleteNode(15);
//		sll.display();
//		
//		System.out.println("------------------------------------------");
//		
//		sll.insertInSortedList(17);
//		sll.display();
//		
//		System.out.println("------------------------------------------");
//		
//		sll.removeDuplicates();
//		sll.display();
//		
//		System.out.println("------------------------------------------");
//		
//		ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(3);
//		System.out.println("Nth node from end is "+nthNodeFromEnd.data);
//		
//		System.out.println("------------------------------------------");
//		
//		System.out.println("Length of SingleLinkedList :- "+sll.length());
//		
//		System.out.println("------------------------------------------");
		
//		SinglyLinkedListDemo sll1 = new SinglyLinkedListDemo();
//		
//		sll1.insertFirst(50);
//		sll1.insertFirst(60);
//		sll1.insertFirst(70);
//		
//		sll1.display();
//		
//		System.out.println("------------------------------------------");
//		
//		ListNode middleNode = sll1.getMiddleNode();
//		System.out.println("Middle Node is "+middleNode.data);
//		
//		System.out.println("------------------------------------------");
//		
//		SinglyLinkedListDemo sll2 = new SinglyLinkedListDemo();
//		
//		sll2.insertLast(1);
//		sll2.insertLast(8);
//		sll2.insertLast(16);
//		
//	 	sll2.display();
//		
//		System.out.println("------------------------------------------");
//				
//		if(sll2.find(head,8)){
//			System.out.println("Search key found !!!");
//		}else{
//			System.out.println("Search key not found !!!");
//		}
//		
//		System.out.println("------------------------------------------");
		
//		ListNode reverseListNode = sll2.reverse();
//		sll2.head = reverseListNode;
//		sll2.display();
//		
//		System.out.println("------------------------------------------");
		
		
		
		

	}

}


/*
 * Time complexity of display method - O(n)

   Space complexity of display method - O(1)
 */













