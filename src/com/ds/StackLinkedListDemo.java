package com.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLinkedList<String> st=
				new StackLinkedList<String>();
		//st.pop();
		st.push("Gopi");
		st.push("Gopi2");
		st.push("Gopi3");
		//st.push("Vad2");
		//while(st.pop()!=null)
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
