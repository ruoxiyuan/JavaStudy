package test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// ��ʼ������
		int[] arr = { 34, 53, 12, 32, 56, 17 };
		sort(arr); //����
		//[12, 17, 32, 34, 53, 56]
		System.out.println(Arrays.toString(arr)); //���ù������ӡ����
	}
	
	private static void sort(int[] arr) {
	    for(int i=0; i<arr.length-1;  i++){
	    	//k������¼����Ԫ������Сֵ������
	    	int k = i; 
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[k] > arr[j]){
	                k = j;
	            }
	        }
	        //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
	        if(k != i){
	        	int temp = arr[k];
	            arr[k] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}
}
