package com.myArray;

import java.util.Arrays;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {20, 10, 30, 40};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		 
		for (int i : nums) {
			System.out.println(i);
		}
			
	}

}
