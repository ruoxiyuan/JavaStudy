package com.silly.exception;
/**
 * 自定义异常
 */
public class HotelAgeException extends Exception {
	public HotelAgeException(){
		super("18岁以下，80岁以上的住客必须由亲友陪同");
	}
}
