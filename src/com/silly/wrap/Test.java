package com.silly.wrap;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str="JAVA  ��� ����";
		//���ַ����Ŀո��滻�ɶ��ţ�JAVA,���,����
		//1.ʹ��split�������ַ������зָ�
		String[] arr = str.split(" ");
		System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
		//2.ʹ��replace���������ַ��滻
		System.out.println(str.replace(" ", ","));
		//3.ʹ��replaceAll���������ַ��滻(\\s+��ʾƥ��1�����ո�)
		System.out.println(str.replaceAll("\\s+", ","));
		//split�ָ������ַ���[, AB, C]
		System.out.println(Arrays.toString("|AB|C".split("\\|")));
		//split�ָ������ַ���[A, B, C]
        System.out.println(Arrays.toString("A*B*C".split("\\*")));
	}
}
