package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IOTest {
	
	public static void main(String[] args) {
		//��������
		List list = new ArrayList();
		//���Ԫ��
		list.add(1);list.add(2);list.add(3);
		//ʹ���б������
		ListIterator iterator = list.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			//ʹ�õ���������ӷ����������Ԫ��
			iterator.add(4);
		}
		System.out.println(list);
		//[1, 4, 2, 4, 3, 4]
	}
}
