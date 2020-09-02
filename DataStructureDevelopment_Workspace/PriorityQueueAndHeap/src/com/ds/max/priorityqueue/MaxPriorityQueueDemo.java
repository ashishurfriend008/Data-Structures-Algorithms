package com.ds.max.priorityqueue;

public class MaxPriorityQueueDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//form an integer array - Represent MaxPQ in the form of an array
	private Integer[] heap;
	//store the size of max heap
	private int n;
	
	//This constructor will take initial capacity of the heap
	public MaxPriorityQueueDemo(int capacity){
		/*
		 * create an initial array whose size will be 
		 * capacity+1 because index 0 is kept as empty
		 */
		heap = new Integer[capacity + 1]; 
		//Initialize n to be zero as there are no elements to this heap
		n = 0;	
	}
	
	//return MaxPQ is empty or not
	public boolean isEmpty(){
		return n ==0;
	}
	
	//It will call n and specify how many elements does Max heap has.
	public int size(){
		return n;
	}
	
	//Insert element in Max priority queue
	public void insertMaxPQ(int x){
		if(n == heap.length -1){
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	
	private void swim(int k){
		/*
		 * compare the newly inserted value to its parent.
		 * If k>1 it means there are more then one element in the heap
		 * compare the value at parent index with the value of kth index.
		 * After swap is performed will simply travered to its parent till new
		 * value inserted to its correct position.
		 */
		while(k>1 && heap[k/2]<heap[k]){
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		}
	}
	
	public void resize(int capacity){
		Integer[] temp = new Integer[capacity];
		for(int i=0; i<heap.length; i++){
			temp[i] = heap[i];
		}
		heap= temp;
	}
	
	public void printMaxPQ(){
		for(int i=1; i<=n; i++){
			System.out.println(heap[i]+ " ");
		}	
	}
	
	public static void main(String[] args) {
		MaxPriorityQueueDemo maxPQ = new MaxPriorityQueueDemo(3);
		System.out.println(maxPQ.isEmpty()); //0
		System.out.println(maxPQ.size());//true
		maxPQ.insertMaxPQ(4);
		maxPQ.insertMaxPQ(5);
		maxPQ.insertMaxPQ(2);
		maxPQ.insertMaxPQ(6);
		maxPQ.insertMaxPQ(1);
		maxPQ.insertMaxPQ(3);
		System.out.println(maxPQ.size());
		System.out.println();
		maxPQ.printMaxPQ();

	}

}


