package com.silly.wrap;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str="JAVA  编程 基础";
		//将字符串的空格替换成逗号：JAVA,编程,基础
		//1.使用split方法对字符串进行分割
		String[] arr = str.split(" ");
		System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
		//2.使用replace方法进行字符替换
		System.out.println(str.replace(" ", ","));
		//3.使用replaceAll方法进行字符替换(\\s+表示匹配1或多个空格)
		System.out.println(str.replaceAll("\\s+", ","));
		//split分割特殊字符：[, AB, C]
		System.out.println(Arrays.toString("|AB|C".split("\\|")));
		//split分割特殊字符：[A, B, C]
        System.out.println(Arrays.toString("A*B*C".split("\\*")));
	}
}
