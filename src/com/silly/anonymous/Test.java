package com.silly.anonymous;

public class Test {

	//���ݴ���Ĳ�ͬ���˵����ͣ����ö�Ӧ��read����
	//����1�����ö�̬���ö�Ӧ�����ʵ��
	public void getRead(Person person){
		person.read();
	}

	public static void main(String[] args) {
		//����һ
		Test test = new Test();
		Man one=new Man();
		Woman two=new Woman();
		test.getRead(one);
		test.getRead(two);	
		//���������������κ����࣬ʹ�������ڲ�����ɾ����read����ʵ��
		test.getRead(new Person(){
			@Override
			public void read() {
				System.out.println("����ϲ�����ƻ����鼮");
			}
		});
		test.getRead(new Person(){
			@Override
			public void read() {
				System.out.println("Ů��ϲ��������С˵");
			}
		});
	}
}
