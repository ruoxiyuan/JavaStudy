package com.silly.people;

public class Person {
	String name = "大大";
	public static int age = 22;

	public Object getHeart(){
		//方法内部类：不能使用任何访问修饰符，不能使用static修饰
		class Heart {
			String name = "小小";
			//类成员可以使用访问修饰符，但不能使用static修饰
			public final int age = 12;
			
			public String beat(){
				new Person().eat();
				return name + Person.age + "的心脏在跳动";
			}
		}
		return new Heart().beat();
	}
	public void eat(){
		System.out.println("人会吃东西");
	}
	
	
	
	/*public static class Heart {
		String name = "小小";
		public static int age = 12;
		public String beat(){
			//2.静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
			//直接访问eat()会报错
			new Person().eat();
			//成员方法可以直接访问内部类中的非静态成员和静态成员
			String str = name + age + "岁的心脏在跳动";
			//4.访问外部类中的非静态成员和同名静态成员
			return new Person().name + Person.age + "的心脏在跳动";
		}
	}*/
	
	
	
	
	
	
/*	//2.访问修饰符可以任意，设置为private则只能在此外部类中创建实例
	 class Heart {
		String name = "小小";
		public String beat(){
			//3.同名属性这里优先访问的是内部类中的name
			String str = name + "的心脏在跳动";
			//4.访问外部类中的同名属性
			str = Person.this.name + "的心脏在跳动";
			//访问外部类中的同名方法
			Person.this.eat();
			return str;
		}
		//同名方法
		public void eat(){
			System.out.println("吃东西");
		}
	}*/
	
}
