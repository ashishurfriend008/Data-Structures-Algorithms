package com.ds.bubblesort;

public class BubbleSortDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void bubbleSort(int[] arr){
		int n = arr.length;
		boolean isSwapped;
		
		for(int i=0; i<n; i++){
			isSwapped = false;
			for(int j=0; j<n-1-i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			//isSwapped is false the we are sure that the array is sorted
			if(isSwapped = false){
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5, 1, 2, 9, 10};
		BubbleSortDemo bsd = new BubbleSortDemo();
		bsd.printArray(arr);
		bsd.bubbleSort(arr);
		bsd.printArray(arr);

	}

}
