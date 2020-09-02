package com.ds.sorting.techniques;

/*
 * In case of selection sort, it will search the smallest element from the list and swap its position
 * to the beginning of the list and so on it carries the same process unless all elements sorted 
 * completely.
 * The algorithm maintains two subarrays in a given array.
 * >> The subarray which is already sorted.
 * >> Remaining subarray which is unsorted.
 */

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int a[]= {38, 52, 9, 18, 6, 62, 13};
		
		//if it would be a string of array
		//String [] b = {"deepak", "amit", "deepash", "vironika", "rahul"};
		
		int min;
		int temp =0;
		
		//measure the length of an array
		for(int i=0; i<a.length; i++){
			
			//i original value doesn't change
			min = i;
			
			/*
			 * Here, j=i+1 because as per the logic it will start searching smallest element after
			 * first position in the list .Moreover, i=0 i.e. 1st position in the list and when i=2
			 * i.e. 2nd position in the list and so on.
			 * position 
			 */
			for(int j=i+1; j<a.length; j++){
				
				/*
				 * if string has to compare and sort the condition is
				 * if(a[i].compareTo(a(min)) < 0)
				 */
				
				//swap index position if j<i
				if(a[j] < a[min]){
					
					min = j;
					
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
		
		//print the sorted array in the list
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+ " ");
		}
		

	}

}
