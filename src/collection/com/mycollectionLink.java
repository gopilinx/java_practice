package collection.com;

import java.util.Iterator;
import java.util.LinkedList;

public class mycollectionLink {

	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("Gopi");
		ls.add("Gopi2");
		ls.add("Gopi3");
		//cannot read through index, 
		//ls.get wont work as this is linked list instead get through element, 
		//use iterator
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
