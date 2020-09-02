package com.ds.array.reversearray;

public class ReverseArrayDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public static void printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void reverseArray(int[] numbers, int start, int end){
		while(start<end){
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		printArray(numbers);
		reverseArray(numbers, 0, numbers.length-1);
		printArray(numbers);
		
		
	}

}


/*
 * Time complexity of reverse method is O(n)

   Space complexity of reverse method is O(1)
 */













