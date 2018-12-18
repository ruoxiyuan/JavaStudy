package test;

import com.silly.animal.Animal;
import com.silly.animal.Cat;
import com.silly.animal.Dog;

public class Test7 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Animal two = new Cat();
		System.out.println(two instanceof Animal); //true
		System.out.println(two instanceof Cat); //true
		System.out.println(two instanceof Object); //true
		System.out.println(two instanceof Dog); //false
		if(two instanceof Cat){ //避免出现类型转换异常
			Cat cat = (Cat)two;
		}
	}
}
