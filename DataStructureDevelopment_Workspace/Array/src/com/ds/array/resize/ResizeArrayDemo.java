package com.ds.array.resize;

public class ResizeArrayDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public int[] resizeArray(int[] arr, int capacity){
		int[] temp = new int[capacity];
		for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		ResizeArrayDemo resizeArr = new ResizeArrayDemo();
		int[] original = new int[] {1,2,3,4,5,10};
		System.out.println("Size of original array :- " +original.length);
		original = resizeArr.resizeArray(original, 11);
		System.out.println("Size of original array after resize:- " +original.length);

	}

}
