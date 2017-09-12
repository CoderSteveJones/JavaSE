package com.mylib;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 静态初始化
		int[] ages = new int[]{1,3};
		System.out.println(ages.length);
		
		// 简单写法
		int[] ages1 = {1, 2, 3};
		System.out.println(ages1.length);
		
		// 动态初始化
		int[] ages2 = new int[100];
		System.out.println(ages2.length);
		
		
		// 数组的操作
//		for (int i = 0; i < ages2.length; i++) {
//			System.out.println(ages2[i]);
//		}
		
		// 数组的操作异常
		// 空指针异常 索引越界异常
		int[] nums = new int[]{10, 11, 20, 30};
		System.out.println("最大数是=" + MyArray.getMax(nums));
	}
	
	// 获取一个int类型数组中的最大数
	static int getMax(int[] array){
		int max = array[0];
		for (int i = 1; i < array.length; i++) {				
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
