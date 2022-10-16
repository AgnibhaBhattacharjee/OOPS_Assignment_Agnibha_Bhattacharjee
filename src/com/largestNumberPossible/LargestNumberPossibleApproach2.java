package com.largestNumberPossible;

import java.util.Scanner;

public class LargestNumberPossibleApproach2 {
	public static String[] largestNoPossibleApproach2(String[] arr){
		
		for(int i=0;i<arr.length-1;i++){
				String str1=arr[0]+arr[i+1];
				String str2=arr[i+1]+arr[0];
				if(str1.compareTo(str2)<0){
					arr[0]=arr[i+1]+arr[0];
				}
				else if(str1.compareTo(str2)>0){
					arr[0]=arr[0]+arr[i+1];
				}
			
		}
		
		return arr;

	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		String[] arr= new String[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
		}
		
		String[] result= largestNoPossibleApproach2(arr);
		System.out.println("Largest no.");
		System.out.println(result[0]);
		
	}

}
