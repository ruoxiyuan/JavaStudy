package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		double d = 123L;

		long a = 3823123123L;

		char c = (char) 65536;
		System.out.println(c + "123");

		char e = '��';
		System.out.println(e);

		String str = "\u005d\u006d";
		System.out.println(str);

		char tt = '5';
		System.out.println(tt);
		float f = 12.123456789f;
		System.out.println(f);
		double ss = 12.12345678912345678;
		System.out.println(ss);
		System.out.println("\"123");
		int z = 10;
		System.out.println(10 + '\n'); // 20,����мӷ����㣬ʹ��ת���ַ������˫���ţ����߱�֤ǰ���Ƿ���ֵ��
		System.out.println("" + z + '\n');
		System.out.println(z + "\n");

		float f1 = 1234567891234567L; // 1.23456795E15
		System.out.println(f1);

		float zx = 5.0f;
		long l = 5;
		System.out.println(zx == l);

		switch (4 / 2) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
		default:
			System.out.println("default");
		}

		System.out.println(45213 / 10000 % 10);

		// break wc; �����������*���������
		// break nc; ����break; �������3�У�ÿ��2��*
		wc: for (int i = 1; i <= 3; i++) {
			nc: for (int j = 1; j <= 4; j++) {
				if (j == 3) {
					break wc; // ֱ���������ѭ��
					// break nc;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
		Test t = new Test();
		t.test();
		int[] arr = new int[10];
		System.out.println(Arrays.toString(arr));
		t.test2();

	}

	public void test(){
		System.out.println("1");
		System.out.println("2");
		
		//break wc; �������**���������
		//break nc; ����break; �������3�У�ÿ��2��*
		wc: for(int i = 1; i <= 3; i++) {
			nc: for(int j = 1; j <= 4; j++) {
				if (j == 3) {
					break wc; //ֱ���������ѭ��
					// break nc;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void test2(){
		// ��ʼ������
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
        //�����СֵĬ��Ϊ��һ��Ԫ��
		int max = intArray[0];
		int min = intArray[0];
		for(int i = 0; i < intArray.length; i++) {
			// ���ǽ���С��Ԫ��ֵ����min����
			if (intArray[i] < min) {
				min = intArray[i];
			}
			// ���ǽ�����Ԫ��ֵ����max����
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("��������ֵΪ��" + max); //6
		System.out.println("�������СֵΪ��" + min); //1
	}

}
