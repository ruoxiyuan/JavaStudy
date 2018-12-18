package test;

import com.silly.tel.Camera;
import com.silly.tel.FourthPhone;
import com.silly.tel.IPhoto;

public class Test8 {

	public static void main(String[] args) {
		
		IPhoto photo = new FourthPhone();
		photo.photo(); //手机可以拍照
		IPhoto photo2 = new Camera();
		photo2.photo(); //相机可以拍照
		
		Camera c = new Camera();
		
		System.out.println(c instanceof IPhoto);
	}
}
