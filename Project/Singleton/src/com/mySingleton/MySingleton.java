package com.mySingleton;

public class MySingleton {
	// 单例
	private static final MySingleton instance = new MySingleton();
	private MySingleton () {}
	public static MySingleton getInstance() {
		return instance;
	}
	public void doWork() {
		System.out.println("单例工作了");
	}
}
