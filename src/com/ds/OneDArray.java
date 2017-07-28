package com.ds;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= new int[5];
		numbers[0]=20;
		numbers[1]=5;
		numbers[2]=11;
		numbers[3]=4;
		numbers[4]=19;
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
		//array of objects
		Student[] students=new Student[4];
		students[0]=new Student("hussein", 27);
		students[1]=new Student("abc", 12);
		students[2]=new Student("xny", 24);
		students[3]=new Student("nop", 34);
		//for (int i=0; i<students.length;i++)
		for (Student student: students)
			System.out.println("name: "+student.name+" age:"+student.age);
	}
}
