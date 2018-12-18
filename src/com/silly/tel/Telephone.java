package com.silly.tel;

//原始手机
public class Telephone {
	private String brand; //品牌
	private int price; //价格
	//打电话
	public void call(){
		System.out.println("手机可以打电话");
	}
	
	
	
	public Telephone(){
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}