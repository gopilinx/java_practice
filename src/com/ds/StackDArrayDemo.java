package com.ds;

public class StackDArrayDemo {

	public static void main(String[] args) {
		StackDArray<Integer> st=
				new StackDArray<Integer>(2);
		st.push(12);
		st.push(13);
		System.out.println("Size satck:"+st.getSize());
		st.push(14);
		System.out.println("Size satck:"+st.getSize());
	}

}
