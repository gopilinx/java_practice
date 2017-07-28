package com.ds;

public class LinkedListUDemo {

	public static void main(String[] args) {
		LinkedListU<String> ls = new LinkedListU<String>();
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
