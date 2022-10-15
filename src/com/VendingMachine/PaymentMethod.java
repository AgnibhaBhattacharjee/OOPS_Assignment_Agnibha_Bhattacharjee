package com.VendingMachine;

public class PaymentMethod {
	
	private String paymentType;
	
	private VendingMachine vendingMachine;
	
	public  PaymentMethod(VendingMachine vendingMachine, String paymentType){
		this.vendingMachine= vendingMachine;
		this.paymentType= paymentType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public VendingMachine getVendingMachine() {
		return vendingMachine;
	}

	public void setVendingMachine(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	public int calculateCartPrice(){
		int cartPrice=vendingMachine.getPrice();
		if(paymentType.equalsIgnoreCase("card")){
			cartPrice=cartPrice*2;
		}
		return cartPrice;
	}

}
