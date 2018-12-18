package com.silly.exception;

import java.util.Scanner;

public class TryDemo {

	public static void main(String[] args) {
		try {
			testThree();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testOne() throws HotelAgeException {
		throw new HotelAgeException();
	}

	public static void testTwo() throws Exception {
		try {
			testOne();
		} catch (HotelAgeException e) {
			//通过构造方法保留异常信息
			throw new Exception("我是新产生的异常1", e);
		}
	}

	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (Exception e) {
			Exception e1=new Exception("我是新产生的异常2");
			//通过initCause方法保留异常信息
			e1.initCause(e);
			throw e1;
//			throw new Exception("我是新产生的异常2",e);
		}
	}
}
