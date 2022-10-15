package com.findPower;

import java.util.Scanner;

public class FindPower {
	public static double findPower(int x, int n){
		if(n==0){
			return 1;
		}
		if(n<0){
			return 1/findPower(x,-n);
		}
		if(n%2==0){
			return findPower(x, n/2)*findPower(x, n/2);
		}
		else{
			return x*findPower(x, (n-1)/2)*findPower(x, (n-1)/2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.");
		int x= sc.nextInt();
		System.out.println("Enter the exponent");
		int n= sc.nextInt();
		System.out.println(String.format("%s ^ %s =%s",x,n,findPower(x, n)));
	}
	

}
