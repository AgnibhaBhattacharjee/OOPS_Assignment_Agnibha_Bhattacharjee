package com.VendingMachine;

import java.util.HashMap;

public class OrderProcess {
	
	private  HashMap<String, Boolean> selectProduct= new HashMap<String, Boolean>();
	private String paymentType;

	public OrderProcess(HashMap<String, Boolean> selectProduct, String paymentType) {
		super();
		this.selectProduct = selectProduct;
		this.paymentType= paymentType;
	}

	public HashMap<String, Boolean> getSelectProduct() {
		return selectProduct;
	}

	public void setSelectProduct(HashMap<String, Boolean> selectProduct) {
		this.selectProduct = selectProduct;
	}
	
	public void cartCheckOut(){
		VendingMachine machine= new VendingMachine();
		machine.setSelectProduct(this.selectProduct);
		PaymentMethod method= new PaymentMethod(machine, this.paymentType);
		System.out.println(String.format("Your order total is %s USD",method.calculateCartPrice()));
	}

}
