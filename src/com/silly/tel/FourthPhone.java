package com.silly.tel;

//���Ĵ��ֻ�
public class FourthPhone implements IPhoto{
	@Override
	public void photo(){
		System.out.println();
		System.out.println("�ֻ���������");
	}
	public void network(){
		System.out.println("�ֻ���������");
	}
	public void game(){
		System.out.println("�ֻ���������Ϸ");
	}
	
	
	@Override
	public void connection() {
		IPhoto.super.connection(); //���ýӿ��е�Ĭ�Ϸ���
		IPhoto.stop(); //���ýӿ��еľ�̬����
	}
}
