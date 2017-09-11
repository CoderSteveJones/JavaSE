package com.mylib;

public class MyFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Function");
		System.out.println(MyFunction.sum(1, 2));
	}
	
	// 方法的重载 ： 两同一不同  同一个类中 方法名相同 参数类型 个数  顺序不同
	static int sum(int a, int b){
		return a + b;
	}

	static double sum(double a, double b){
		return a + b;
	}
	
	
	// 方法的递归 ： 菲波那切数列 f（0） = 0; f(1) = 1; f(n) = f(n - 1) + f(n _ 2);
	static int f(int a) {
		if (a == 0) {
			return 0;
		}else if (a == 1) {
			return 1;
		}else {
			return f(a) + f(a - 1);
		}
	}

}
