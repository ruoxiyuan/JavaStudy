package test;

import com.silly.animal.Animal;
import com.silly.animal.Cat;
import com.silly.animal.Dog;

public class Test3 {

	
	public static void main(String[] args) {
		Cat one=new Cat();
		one.setName("����");
		one.eat();
		one.run();
		System.out.println("===================");
		Dog two=new Dog();
		two.setName("С��");
		two.setMonth(1);
		two.eat();
		two.sleep();
		Animal three = new Animal();
		//three.run();  �����޷������������еĳ�Ա
		//three.sleep();
		
		/*�����ڳԶ���
		     ������һֻ�л���԰è,���ڿ��ֵı���
          ===================
                          С�����û��ʳ��~~
                          С������1���´�����˯��~~
		 */
	}
}
