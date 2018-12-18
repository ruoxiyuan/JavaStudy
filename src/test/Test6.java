package test;

import com.silly.animal.Animal;

public class Test6 {

	public static void main(String[] args) {
		Animal one=new Animal("花花",2);
		Animal two=new Animal("花花",2);
		//equals方法在Object类中的实现是比较两个引用是否指向同一个对象
		System.out.println(one.equals(two)); //false
		System.out.println(one==two); //false
		System.out.println("======================================");
		String str1=new String("hello");
		String str2=new String("hello");
		//equals方法在String类中进行了重写，比较的是字符串内容是否相同
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str2); //false
		/*toString测试:
		 * 1、输出对象名时，默认会直接调用类中的toString
		 * 2、继承Object中的toString方法时，输出对象的字符串表示形式：类型信息+@+地址信息
		 * 2、子类可以通过重写equals方法的形式，改变输出的内容以及表现形式
		 */
		System.out.println(one.toString()); //com.silly.animal.Animal@15db9742
		System.out.println(one); //com.silly.animal.Animal@15db9742
		System.out.println("======================================");
		System.out.println(str1); //hello
	}
}
