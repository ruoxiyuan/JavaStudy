package test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// 初始化数组
		int[] arr = { 34, 53, 12, 32, 56, 17 };
		sort(arr); //排序
		//[12, 17, 32, 34, 53, 56]
		System.out.println(Arrays.toString(arr)); //调用工具类打印数组
	}
	
	private static void sort(int[] arr) {
	    for(int i=0; i<arr.length-1;  i++){
	    	//k用来记录其他元素中最小值的索引
	    	int k = i; 
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[k] > arr[j]){
	                k = j;
	            }
	        }
	        //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
	        if(k != i){
	        	int temp = arr[k];
	            arr[k] = arr[i];
	            arr[i] = temp;
	        }
	    }
	}
}
