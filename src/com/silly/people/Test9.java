package com.silly.people;

public class Test9 {

	public static void main(String[] args) {
		
		/*Person ricky = new Person();
		//获取成员内部类对象实例，方式1：new 外部类.new 内部类
		Person.Heart heart = new Person().new Heart();
		System.out.println(heart.beat());
		//获取成员内部类对象实例，方式1：外部类对象.new 内部类
		heart = ricky.new Heart();
		//获取成员内部类对象实例，方式3：外部类对象.获取方法
		Person.Heart heart2 = ricky.getHeart();
		
		System.out.println(heart2.beat());*/
		
		/*//获取静态内部类对象实例
		Person.Heart heart = new Person.Heart();
		System.out.println(heart.beat());
		//3可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员
		Person.Heart.age = 15;*/
		
		
		Person ricky = new Person();
		System.out.println(ricky.getHeart());
		
	}
}
