package com.silly.tel;

//ԭʼ�ֻ�
public class Telephone {
	private String brand; //Ʒ��
	private int price; //�۸�
	//��绰
	public void call(){
		System.out.println("�ֻ����Դ�绰");
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