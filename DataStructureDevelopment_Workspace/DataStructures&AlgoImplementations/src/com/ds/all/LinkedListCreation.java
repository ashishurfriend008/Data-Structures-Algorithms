package com.ds.all;

public class LinkedListCreation {
	
	
	//print all elements in LinkedList it holds
	public static void display(ListNode head){
		
		if(head == null){
			return;
		}
		ListNode current = head;
		while(current != null){
			System.out.println(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
	}
	
	//Given a ListNode head , find length in LinkedList
	public static int findLength(ListNode head){
		
		if(head == null){
			return 0;
		}
		ListNode current = head;
		//create a count variable to hold length
		int count = 0;
		//loop eacg element and increment the count till last end.
		while(current != null){
			count++;
			//move to next node
			current = current.next;
		}
		//the count value will be the length of linked list
		return count;
	}
	
	//insert node at the begining of LinkedList
	public ListNode insertNodeAtBeginning(ListNode head , int data){
		
		ListNode newNode = new ListNode(data);
		
		if(head == null){
			return newNode;
		}
		
		newNode.next = head;
		
		head = newNode;
		
		return head;
	}
	
	//insert node at the end of LinkedList
	public ListNode insertNodeAtEnd(ListNode head , int data){
		
		ListNode newNode = new ListNode(data);
		
		//if there are no elements in the list then head is the new node itself.
		if(head == null){
			return newNode;
		}
		//temporary list node variable by name current which points to head 
		ListNode current = head;
		while(null != current.next){
			current = current.next;
		}
		current.next = newNode;
		return head;
	}
	
	//insert node after a given node
	public void insertAfter(ListNode previous , int data){
		if(previous == null){
			System.out.println("The given previous can not be null");
			return;
		}
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
	}
	
	//delete first node
	public ListNode deleteFirstNode(ListNode head){
		if(head == null){
			return head;
		}
		ListNode temp  = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//delete last node
	public ListNode deleteLastNode(ListNode head){
		if(head == null){
			return head;
		}
		ListNode last = head;
		ListNode previousToLast = null;
		
		while(last.next != null){
			previousToLast = last;
			last = last.next;
		}
		previousToLast.next = null;
		return last;
		
	}
	
	//delete node at linked list at given position
	/*
	 * 
	 * in order to keep tracker number of nodes traverse we create a count variable and initialize to 1 
	  .In while loop , previous node traverses to a node which is just before position node.
	  When while loop terminates this signifies that previous node has reached second node from where we
	   can delete third node i.e.position node.
	 */
	public ListNode  deleteNodeAtGivenPosition(ListNode head , int position){
		
		if(position == 1){
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}else{
		ListNode previous = head;
		int count = 1;
		
		while(count < position - 1){
			previous = previous.next;
			count++;
		}
		
		ListNode current = previous.next;
		previous.next = current.next;
		current.next = null;
		return current;
		}
	}
	
	//search an element in the linked list
	public boolean find(ListNode head , int searchKey){
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
	
	//reverse linked list
	public ListNode reverse(ListNode head){
		if(head == null){
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null){
			next  = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	//Find middle node of linked list
	public ListNode getMiddleNode(ListNode head){
		if(head == null){
			return null;
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null){
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
		}
 		return slowPtr;
	}
	
	/*Find the nth node at the end of the list.
	 * This means , second position at the end of Linked List.
	 */
	public ListNode getNthNodeAtEndLinkedList(ListNode head , int n){
		if(head == null){
			return null;
		}
		if(n <= 0){
			throw new IllegalArgumentException("Invalid value n :- " +n);
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		
		while(count < n){
		refPtr = refPtr.next;
		count++;
		}
		
		while(refPtr != null){
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	//Remove duplicates from sorted linked list
	public void removeDuplicatesFromLinkedList(ListNode head){
		if(head == null){
			return;
		}
		ListNode current = head;
		
		while(current != null && current.next != null){
			if(current.data == current.next.data){
				current.next = current.next.next;
			}else{
				current = current.next;
			}
		}
		
	}
	
	//insert node at sorted singly linked list
	public ListNode insertNodeSinglySortedLinkedList(ListNode head , int value){
		
		ListNode newNode = new ListNode(value);
		
		if(head == null){
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		
		
		while(current != null && current.data < newNode.data){
			temp = current;
			current = current.next;
			
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	//Remove key from singly linked list
	public void removeKeySinglyLinkedList(ListNode head , int key){
		
		ListNode current = head;
		ListNode temp = null;
		
		while(current != null && current.data != key){
			temp = current;
			current = current.next;
		}
		
		if(current == null){
			return ;
		}
		temp.next = current.next;
	}
	
	//It contains a static inner class ListNode
	private static class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
	}
	}
	

	public static void main(String[] args) {
		
		//Lets create a LinkedList demonstated in slide
		//10 --> 8 --> 8 --> 1 --> 11 --> null
		//10 as the head node of LinkedList
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(7);
		ListNode third = new ListNode(6);
		ListNode fourth = new ListNode(1);
		ListNode fifth = new ListNode(11);
		ListNode sixth = new ListNode(12);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		System.out.println("LinkedList Creation");
		
		LinkedListCreation linkedListCreation = new LinkedListCreation();
		LinkedListCreation.display(head);

//		System.out.println("Length of linked list :-" +linkedListCreation.findLength(head));
//		ListNode newHead = linkedListCreation.insertNodeAtBeginning(head,9);
//		LinkedListCreation.display(newHead);
//		ListNode lastNode = linkedListCreation.insertNodeAtEnd(head, 20);
//		LinkedListCreation.display(lastNode);
//		linkedListCreation.insertAfter(second , 30);
//		LinkedListCreation.display(lastNode);
//		ListNode deletedNode = linkedListCreation.deleteFirstNode(head);
//		System.out.println(deletedNode.data);
//		ListNode deleteLast = linkedListCreation.deleteLastNode(head);
//		System.out.println("Last Node deleted :- " +deleteLast.data);
//		ListNode thirdNode = linkedListCreation.deleteNodeAtGivenPosition(head, 3);
//		System.out.println("Deleting the third node :-" +thirdNode.data);
//		
//		if(linkedListCreation.find(head, 10)){
//			System.out.println("Search Key Found !!!!");
//		}else{
//			System.out.println("Search Key Not Found !!!!");
//		}
		System.out.println("Reverse Linked List Creation");
		ListNode reverseListHead  = linkedListCreation.reverse(head);
		LinkedListCreation.display(reverseListHead);
//		
//		System.out.println("Middle Node Of Linked List");
//		ListNode middleNode = linkedListCreation.getMiddleNode(head);
//		System.out.println("Middle Node :- " +middleNode.data);
//		
//		ListNode nthNodeFromEnd = linkedListCreation.getNthNodeAtEndLinkedList(head , 2);
//		System.out.println("nth node from end :- " + nthNodeFromEnd.data);
//		
//		System.out.println("Remove Duplicates From Sorted Linked List");
//		linkedListCreation.removeDuplicatesFromLinkedList(head);
//		LinkedListCreation.display(head);
		
//		System.out.println("Insert a node in sorted singly linked list");
//		linkedListCreation.insertNodeSinglySortedLinkedList(head , 4);
//		LinkedListCreation.display(head);
		
//		System.out.println("Remove a given key from singly linked list");
//		linkedListCreation.removeKeySinglyLinkedList(head, 6);
//		LinkedListCreation.display(head);
		
		
	}

}
	
