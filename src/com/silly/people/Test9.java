package com.silly.people;

public class Test9 {

	public static void main(String[] args) {
		
		/*Person ricky = new Person();
		//��ȡ��Ա�ڲ������ʵ������ʽ1��new �ⲿ��.new �ڲ���
		Person.Heart heart = new Person().new Heart();
		System.out.println(heart.beat());
		//��ȡ��Ա�ڲ������ʵ������ʽ1���ⲿ�����.new �ڲ���
		heart = ricky.new Heart();
		//��ȡ��Ա�ڲ������ʵ������ʽ3���ⲿ�����.��ȡ����
		Person.Heart heart2 = ricky.getHeart();
		
		System.out.println(heart2.beat());*/
		
		/*//��ȡ��̬�ڲ������ʵ��
		Person.Heart heart = new Person.Heart();
		System.out.println(heart.beat());
		//3����ͨ���ⲿ��.�ڲ���.��̬��Ա�ķ�ʽ�������ڲ����еľ�̬��Ա
		Person.Heart.age = 15;*/
		
		
		Person ricky = new Person();
		System.out.println(ricky.getHeart());
		
	}
}
