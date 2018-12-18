package com.silly.tel;

//第四代手机
public class FourthPhone implements IPhoto{
	@Override
	public void photo(){
		System.out.println();
		System.out.println("手机可以拍照");
	}
	public void network(){
		System.out.println("手机可以上网");
	}
	public void game(){
		System.out.println("手机可以玩游戏");
	}
	
	
	@Override
	public void connection() {
		IPhoto.super.connection(); //调用接口中的默认方法
		IPhoto.stop(); //调用接口中的静态方法
	}
}
