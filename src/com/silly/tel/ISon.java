package com.silly.tel;

public interface ISon extends IFather, IFather2{
	void run();
	@Override
	default void connection() {
		//IFather.super.connection();
		System.out.println("ISon中的connection"); //必须实现
	}
}
