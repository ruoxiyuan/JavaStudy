package com.silly.anonymous;

import com.silly.animal.Animal;

public class Demo {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			@Override
			public void eat() {
				System.out.println("666");
			}
		};
		animal.eat();
	    //�����൱�ڰ�<<��ߵ�������2���ƶ��η�(��)
	    System.out.println(3<<2);//12=3*4=3*2^2
	    
	    //�����൱�ڰ�>>��ߵ�������2���ƶ��η�(��)
	     System.out.println(24>>2);//24/4=6
	     System.out.println(24>>>2);//24/4=6

	     System.out.println(-24>>2);//-24/4=-6
	     System.out.println(-15 >>> 2);//1073741818
	     
	     int a = 3, b = 5;
	     System.out.println(a ^ b ^ b);//3
	     System.out.println(b ^ a ^ a);//5
	}
}
