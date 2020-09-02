package com.ds.insertionsort;

public class InsertionSortDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//print array
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+ " ");
		}
	}
	
	public void insertionSort(int[] arr){
		int n = arr.length;
		
		//unsorted part
		for(int i=1; i<n; i++){
			int temp = arr[i];
			//sorted part
			int j = i-1;
			
			while(j>=0 && arr[j] > temp){
				//shifting larger elements to temp by 1 position
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5, 1, 2, 9, 10};
		InsertionSortDemo insertionSort = new InsertionSortDemo();
		insertionSort.printArray(arr);
		insertionSort.insertionSort(arr);
		System.out.println();
		insertionSort.printArray(arr);

	}

}
