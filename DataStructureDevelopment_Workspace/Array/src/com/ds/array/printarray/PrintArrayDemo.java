package com.ds.array.printarray;

public class PrintArrayDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public void printArray(int[] arr){
		int n = arr.length;
		
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		PrintArrayDemo printArr = new PrintArrayDemo();
		printArr.printArray(new int[] {1,2,3,4,5,6});		

	}

}
