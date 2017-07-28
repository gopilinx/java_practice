package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		LinkedListD<String> ls = new LinkedListD<String>();
		ls.add("Gopi");
		ls.add("Gopi2");
		ls.add("Ram");
		ls.add("Krishna");
		System.out.println("before delete");
		ls.display();
		System.out.println("after delete");
		ls.delete();
		ls.display();
	}
}
