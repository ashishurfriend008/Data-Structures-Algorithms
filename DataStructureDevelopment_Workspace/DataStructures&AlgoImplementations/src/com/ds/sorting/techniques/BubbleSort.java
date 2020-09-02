package com.ds.sorting.techniques;

/*
 * In case of bubble sort, in each round, largest element of the list is placed at the highest index of the
 * list.
 */

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] a = {36, 19, 29, 12, 5};
		//String [] a = {"deepak", "amit", "deepash", "vironika", "rahul"};
		
		int temp;
		
		//String temp;
		
		//measure the length of an array and also to verify number of rounds
		for(int i=0; i<a.length; i++){
			
			/*
			 * If the elements is long in a list and elements are sorted as well but still few
			 * rounds left for comparison and swamping of elements then there will be no further
			 * checking by comparing and swamping of elements. 
			 * At first we put a variable i.e. flag to zero and once the elements are sorted in 
			 * condition then it will make the flag variable to 1. 
			 */
			
			int flag =0;
			
			/*
			 * to know adjacent element in the array.
			 * Here, -i represents that it will not compare first largest, second largest,
			 * third largest elements in the list bacause these elements get sorted already and
			 * again it won't take it up in further rounds for checking and sorting.Once it will sort
			 * the largest element in first round itself than again it will not take into consideration for
			 * comparision and sorting and so on.
			 * 
			 */
			for(int j=0; j<a.length-1-i;j++){
				
				/*
				 * now, compare two adjacent element;if first adjacent element if greater than
				 * second adjacent element than swap both.Inorder to do swaping, take temp as 
				 * temporary variable. 
				 */
				/*
				 * In case of string comparision will be done by compareTo method of String class.
				 * The condition will be 
				 * if(a[j].compareTo(a[J+1] > 0)).compareTo method will return 0,1and -1 integer values.
				 * Each character of both the strings is converted into a Unicode value for comparison.
				 * If both the strings are equal then this method returns 0 else it returns positive or
				 * negative value.The result is positive if the first string is lexicographically greater
				 * than the second string else the result would be negative.
				 */
				
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			/*
			 * if flag value is zero than numbers not sorted.If once the numbers sorted completely than it
			 * won't execute the above for loop 
			 */
			if(flag == 0){
				break;
			}
		}
		    //This loop will now print the sorted array.
			for(int i=0; i<a.length;i++){
				System.out.println(a[i]+ " ");
			}

	}

}
