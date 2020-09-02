package com.ds.array.findminimumvalue;

public class FindMinimumValueDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public int findMinimumValue(int[] arr){
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException("Invalid Array");
		}
		
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		FindMinimumValueDemo findMinimum = new FindMinimumValueDemo();
		int[] arr = {5, 9, 3, 15, 1, 2};
		System.out.println(findMinimum.findMinimumValue(arr));

	}

}
