package com.myArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "小明";
		s1.isFee = true;
	
		Student s2 = new Student();
		s2.name = "小方";
		s2.isFee = false; 
		
		Student[] students = new Student[]{s1,s2};
		for (Student student : students) {
			if (student.isFee) {
				System.out.println(student.name +  "交费了");
			}else{
				student.fees();
			} 	
		}
	}

}