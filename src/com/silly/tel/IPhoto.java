package com.silly.tel;

/**
 * 具有照相能力的接口
 */
public interface IPhoto {
	//拍照方法
	public void photo();
	
	default void connection(){
		System.out.println("我是接口中的默认链接");
	}
	
	static void stop(){
		System.out.println("我是接口中的静态方法");
	}
	
	int x = 12;
}
