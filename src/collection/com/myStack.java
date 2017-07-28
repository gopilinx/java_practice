package collection.com;

import java.util.Stack;

public class myStack {

	public static void main(String[] args) {
		Stack<String> st= new Stack<String>();
		st.push("Gopi");
		st.push("Kumar");
		st.push("Vad");
		System.out.println(st.pop());
	}

}
