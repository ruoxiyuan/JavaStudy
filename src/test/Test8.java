package test;

import com.silly.tel.Camera;
import com.silly.tel.FourthPhone;
import com.silly.tel.IPhoto;

public class Test8 {

	public static void main(String[] args) {
		
		IPhoto photo = new FourthPhone();
		photo.photo(); //�ֻ���������
		IPhoto photo2 = new Camera();
		photo2.photo(); //�����������
		
		Camera c = new Camera();
		
		System.out.println(c instanceof IPhoto);
	}
}
