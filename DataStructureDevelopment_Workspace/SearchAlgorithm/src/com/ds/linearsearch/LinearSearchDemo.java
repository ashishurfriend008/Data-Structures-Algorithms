package com.ds.linearsearch;

public class LinearSearchDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public int linearSearch(int arr[], int n, int x){
		for(int i=0; i<n; i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 9, 2, 10, 15, 20};
		LinearSearchDemo lsd = new LinearSearchDemo();
		System.out.println(lsd.linearSearch(arr, arr.length, 10));
		System.out.println(lsd.linearSearch(arr, arr.length, 50));

	}

}
