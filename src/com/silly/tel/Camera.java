package com.silly.tel;

//相机
public class Camera implements IPhoto {
	@Override
	public void photo() {
		System.out.println("相机可以拍照");
	}

}
