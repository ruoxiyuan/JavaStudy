package test;

import com.silly.animal.Animal;

public class Test6 {

	public static void main(String[] args) {
		Animal one=new Animal("����",2);
		Animal two=new Animal("����",2);
		//equals������Object���е�ʵ���ǱȽ����������Ƿ�ָ��ͬһ������
		System.out.println(one.equals(two)); //false
		System.out.println(one==two); //false
		System.out.println("======================================");
		String str1=new String("hello");
		String str2=new String("hello");
		//equals������String���н�������д���Ƚϵ����ַ��������Ƿ���ͬ
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str2); //false
		/*toString����:
		 * 1�����������ʱ��Ĭ�ϻ�ֱ�ӵ������е�toString
		 * 2���̳�Object�е�toString����ʱ�����������ַ�����ʾ��ʽ��������Ϣ+@+��ַ��Ϣ
		 * 2���������ͨ����дequals��������ʽ���ı�����������Լ�������ʽ
		 */
		System.out.println(one.toString()); //com.silly.animal.Animal@15db9742
		System.out.println(one); //com.silly.animal.Animal@15db9742
		System.out.println("======================================");
		System.out.println(str1); //hello
	}
}
