package com.largestNumberPossible;

import java.util.Scanner;

public class LargestNumberPossible {
	public static int[] largestNoPossible(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				String str1=String.valueOf(arr[i])+String.valueOf(arr[j]);
				String str2=String.valueOf(arr[j]+String.valueOf(arr[i]));
				if(str1.compareTo(str2)<0){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;

	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int[] result= largestNoPossible(arr);
		System.out.println("Largest no.");
		for(int num:result){
			System.out.print(String.valueOf(num));
		}
		
	}

	
}
