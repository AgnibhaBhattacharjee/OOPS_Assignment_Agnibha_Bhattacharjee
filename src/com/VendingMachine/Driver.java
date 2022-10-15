package com.VendingMachine;

import java.util.HashMap;
import java.util.Scanner;

public class Driver {
	public static HashMap<String, Boolean> selectProduct= new HashMap<String, Boolean>();
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice;
		
		do{
			addToCart(sc);
			
			System.out.println("Which type of payment method you would like?(Cash/Card)");
			String payment=sc.next().toLowerCase();
			OrderProcess order= new OrderProcess(selectProduct, payment);
			order.cartCheckOut();
			System.out.println("Press 1 for continue 0 for exit");
			choice= sc.nextInt();
			
			
		}while(choice==1);
	}
	
	public static void addToCart(Scanner sc){
		System.out.println("List of products are:\n"
				+"1. Mobile (20000 USD)\n"
				+"2. Smart TV (30000 USD)\n"
				+"3. Smart watch (4000 USD)\n"
				+"4. Washing machine (18000 USD)\n"
				+"5. Mirowave oven (5000 USD)");
		
		System.out.println("Do you want mobile to add in your cart?(Y/N)");
		String mobile= sc.next().toLowerCase();
		if(mobile.equals("y")){selectProduct.put("Mobile", true);}
		else{selectProduct.put("Mobile", false);}
		
		System.out.println("Do you want Smart TV to add in your cart?(Y/N)");
		String smartTv= sc.next().toLowerCase();
		if(smartTv.equals("y")){selectProduct.put("Smart TV", true);}
		else{selectProduct.put("Smart TV", false);}
		
		System.out.println("Do you want Smart watch to add in your cart?(Y/N)");
		String smartWatch= sc.next().toLowerCase();
		if(smartWatch.equals("y")){selectProduct.put("Smart watch", true);}
		else{selectProduct.put("Smart watch", false);}
		
		System.out.println("Do you want Washing machine to add in your cart?(Y/N)");
		String washingMachine= sc.next().toLowerCase();
		if(washingMachine.equals("y")){selectProduct.put("Washing machine", true);}
		else{selectProduct.put("Washing machine", false);}
		
		System.out.println("Do you want Mirowave oven to add in your cart?(Y/N)");
		String microwaveOven= sc.next().toLowerCase();
		if(microwaveOven.equals("y")){selectProduct.put("Mirowave oven", true);}
		else{selectProduct.put("Mirowave oven", false);}
		
		
		
			}

}
