package com.stringPalindromeRecursion;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean isPalindrome(String str, int start, int end){
		
		if(start==end){
			return true;
		}
		
		if(str.charAt(start)!=str.charAt(end)){
			
			return false;
		}
		if(start<end+1){
			isPalindrome(str,start+1,end-1);
		}
		
			return true;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine().toLowerCase();
		System.out.println(isPalindrome(input,0,(input.length()-1)));
	}

}


