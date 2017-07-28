package com.ds.hash;

import javax.print.DocFlavor.STRING;

public class HashTableArrayDemo {

	public static void main(String[] args) {
		HashTableArray<String> hm=
				new HashTableArray<String>(10);
		hm.put(11, "Gopi");
		hm.put(12, "Gopi2");
		hm.put(13, "Gopi3");
		System.out.println(hm.get(11));
	}

}
