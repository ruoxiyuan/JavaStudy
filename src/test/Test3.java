package test;

import com.silly.animal.Animal;
import com.silly.animal.Cat;
import com.silly.animal.Dog;

public class Test3 {

	
	public static void main(String[] args) {
		Cat one=new Cat();
		one.setName("花花");
		one.eat();
		one.run();
		System.out.println("===================");
		Dog two=new Dog();
		two.setName("小黄");
		two.setMonth(1);
		two.eat();
		two.sleep();
		Animal three = new Animal();
		//three.run();  父类无法访问子类特有的成员
		//three.sleep();
		
		/*花花在吃东西
		     花花是一只中华田园猫,它在快乐的奔跑
          ===================
                          小黄最近没有食欲~~
                          小黄现在1个月大，它在睡觉~~
		 */
	}
}
