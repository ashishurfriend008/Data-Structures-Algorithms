package com.ds.dynamicprogramming;

public class FibonacciNumberBUADemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	//Botton Up Approach
	public int fibo(int n){
		int[] table = new int[n + 1];
		
		table[0] = 0;
		table[1] = 1;
		
		for(int i=2; i<=n; i++){
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}
	
	public static void main(String[] args) {
		FibonacciNumberBUADemo fibonacciNumber = new FibonacciNumberBUADemo();
		System.out.println("The 6th fibonacci number is - "+fibonacciNumber.fibo(6));
		
		
	}

}
