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
			//ͨ�����췽�������쳣��Ϣ
			throw new Exception("�����²������쳣1", e);
		}
	}

	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (Exception e) {
			Exception e1=new Exception("�����²������쳣2");
			//ͨ��initCause���������쳣��Ϣ
			e1.initCause(e);
			throw e1;
//			throw new Exception("�����²������쳣2",e);
		}
	}
}
