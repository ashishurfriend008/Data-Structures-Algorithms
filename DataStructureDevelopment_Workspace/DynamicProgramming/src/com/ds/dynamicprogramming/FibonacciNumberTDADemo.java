package com.ds.dynamicprogramming;

public class FibonacciNumberTDADemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//Top Down Approach
	public int fib(int[] memo, int n){ // 0 to 6
		if(memo[n] == 0){
			if(n < 2){
				memo[n] = n; // 0 and 1
			}else{
				//current number is the sum of preceding two numbers.
				int left = fib(memo, n-1);
				int right = fib(memo, n-2);
				memo[n] = left + right;
						
			}
		}
		return memo[n];
		
	}
	
	public static void main(String[] args) {
		FibonacciNumberTDADemo fibonacciNumber = new FibonacciNumberTDADemo();
		System.out.println("The 6th fibonacci number is - "+fibonacciNumber.fib(new int[6+1], 6) );
		//0,1,1,2,3,5,8
		
	}

}
