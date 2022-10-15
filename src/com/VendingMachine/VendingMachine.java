package com.VendingMachine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VendingMachine {
	public static HashMap<String, Integer> product;
	static{
		product = new HashMap<String, Integer>();
		product.put("Mobile", 20000);
		product.put("Smart TV", 30000);
		product.put("Smart watch", 4000);
		product.put("Washing machine", 18000);
		product.put("Mirowave oven", 5000);
	}
	
	private int price;
	private HashMap<String, Boolean> selectProduct;
	
	public VendingMachine(){
		
		
	}
	public VendingMachine(int price, HashMap<String, Boolean> selectProduct) {
		super();
		this.price = price;
		this.selectProduct = selectProduct;
	}
	public static HashMap<String, Integer> getProduct() {
		return product;
	}
	public static void setProduct(HashMap<String, Integer> product) {
		VendingMachine.product = product;
	}
	public int getPrice() {
		return price;
	}
	
	public HashMap<String, Boolean> getSelectProduct() {
		return selectProduct;
	}
	public void setSelectProduct(HashMap<String, Boolean> selectProduct) {
		this.selectProduct = selectProduct;
		setPrice();
	}
	public void setPrice() {
		int cartPrice=0;
		Iterator itr1 = selectProduct.entrySet().iterator();
		Iterator itr2 = product.entrySet().iterator();
		while(itr1.hasNext() && itr2.hasNext()){
			Map.Entry entry1= (Map.Entry) itr1.next();
			Map.Entry entry2= (Map.Entry) itr2.next();
			if( entry1.getKey().equals(entry2.getKey()) && (boolean) entry1.getValue() ){
				cartPrice= cartPrice+ (int)entry2.getValue();
			}
		}
		this.price= cartPrice;
		
		
	}

}
