package com.myArray;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {10, 20, 30, 40};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
			
	}

}
