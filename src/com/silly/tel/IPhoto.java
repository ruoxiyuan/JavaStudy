package com.silly.tel;

/**
 * �������������Ľӿ�
 */
public interface IPhoto {
	//���շ���
	public void photo();
	
	default void connection(){
		System.out.println("���ǽӿ��е�Ĭ������");
	}
	
	static void stop(){
		System.out.println("���ǽӿ��еľ�̬����");
	}
	
	int x = 12;
}
