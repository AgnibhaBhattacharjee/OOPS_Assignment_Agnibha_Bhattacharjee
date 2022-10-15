package com.sumEqualsToTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySum {
	
	public static List<Integer> sumEqualsToTarget(int[] arr, int target){
		List<Integer> list= new ArrayList<>();
		int start=0;
		int end=arr.length-1;
		while(start<end){
			if(arr[start]+arr[end]== target){
				list.add(start);
				list.add(end);
				break;
			}
			else if(arr[start]+arr[end]<target){
				start++;
			}
			else if(arr[start]+arr[end]>target){
				end--;
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		System.out.println("Enter the array elements in sorted order");
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
		int target= sc.nextInt();
	
		//Arrays.sort(arr);
		
		System.out.println("The indexs are "+sumEqualsToTarget(arr, target));
		
	}

}
