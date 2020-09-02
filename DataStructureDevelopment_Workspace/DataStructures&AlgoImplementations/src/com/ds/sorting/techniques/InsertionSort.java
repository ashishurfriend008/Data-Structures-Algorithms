package com.ds.sorting.techniques;

/*
 * In this algorithm, we insert each element onto its proper place in the sorted array.
 */

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = {5, 1, 6, 2, 4, 3};
	
		int temp, j;
		
		//measure the length of an array
		for(int i=1; i<a.length; i++){
			
			temp = a[i];
			j = i;
			
			//if i=3 or 5 than it will check till 0 index position of the array
			while(j > 0 && a[j-1] > temp){
				
				
				a[j] = a[j-1];
				//decrease the value of j
				j = j-1;
			}
			
			a[j] = temp;
		}
		
		//print the sorted array in the list
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+ " ");
		  }

	}

}
