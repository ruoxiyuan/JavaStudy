package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IOTest {
	
	public static void main(String[] args) {
		//创建集合
		List list = new ArrayList();
		//添加元素
		list.add(1);list.add(2);list.add(3);
		//使用列表迭代器
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			//使用迭代器的添加方法进行添加元素
			iterator.add(4);
		}
		System.out.println(list);
		//[1, 4, 2, 4, 3, 4]
	}
}
