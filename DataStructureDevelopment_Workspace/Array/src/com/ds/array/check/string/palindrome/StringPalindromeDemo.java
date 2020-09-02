package com.ds.array.check.string.palindrome;

public class StringPalindromeDemo {

	/**
	 * @Ashish Ku. Dey
	 */
	
	public boolean stringIsPalindrome(String word){
		char[] charArray = word.toCharArray();
		
		int start = 0;
		int end = word.length() - 1;
		
		while(start < end){
			if(charArray[start] != charArray[end]){
				return false;
			}
			
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		StringPalindromeDemo strPalindrome = new StringPalindromeDemo();
		if(strPalindrome.stringIsPalindrome("MADAM")){
			System.out.println("String is palindrome!!!");
		}else{
			System.out.println("String is not palindrome!!!");
		}

	}

}
