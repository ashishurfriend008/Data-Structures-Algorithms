package com.ds.all;

/*
 * The basic idea behind this algorithm is that , we will move fast pointer by two steps
 * and slow pointer by one step.
 */

public class DetechLoopInLinkedList {
	
	private ListNode head;
	
	private class ListNode{
		
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	/*
	 * Detech loop
	 */
	public boolean containsLoop(){
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null){
			
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			//identification of linkedlist contains loop
			if(fastPtr == slowPtr){
				return true;
			}
		}
		//if we have not found any loop then simply returns false.
		return false;
	}
	
	/*
	 * Create Linked List which contains loop
	 */
	public void createALoopInLinkedList(){
		
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		//As head points to first node
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		//sixth.next  = third;
		}

	public static void main(String[] args) {
		
		DetechLoopInLinkedList detechLoopInLinkedList = new DetechLoopInLinkedList();
		detechLoopInLinkedList.createALoopInLinkedList();
		System.out.println(detechLoopInLinkedList.containsLoop());
	}

}
