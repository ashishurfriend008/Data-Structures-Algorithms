//package com.ds.sorting.techniques;
//
//public class MergeSort {
//	
//	int[] array;
//	int[] tempMergeArr;
//	int length;
//	
//	
//	
//	public void sort(int inputArray[]){
//	
//		this.array = inputArray;
//		
//		//here the length of array is 7
//		this.length = inputArray.length;
//		
//		//created temporary array
//		this.tempMergeArr = new int[length];
//		
//	}
//	
//	//Merge sort depends upon divide and conqure rule
//	public void divideArray(int lowerIndex , int higherIndex){
//		
//		if(lowerIndex < higherIndex){
//			
//			int middle = lowerIndex + (higherIndex - lowerIndex)/2; 
//			
//			//Use Recursion - it will sort the left side of an array
//			divideArray(lowerIndex , middle);
//			
//			//Use Recursion - it will sort the right side of an array
//			divideArray(middle + 1, higherIndex);
//			
//			//call the mergeArray method
//			
//			
//			
//		}
//		
////		public void mergeArray(int lowerIndex, int middle, int higherIndex){
////			
////		}
////	}
//
//	public static void main(String[] args) {
//		
//		//take input array of six elements
//		int[] inputArray = {48, 36, 13, 52, 19, 94, 21};
//		
//		//create object of MergeSort
//		MergeSort mergeSort = new MergeSort();
//		
//		//pass inputArray
//		mergeSort.sort(inputArray);
//		
//		
//		
//			
//		}
//
//	}
//
//
