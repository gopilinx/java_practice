package collection.com;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class mycollectionsSets {

	public static void main(String[] args) {
		//HashSet<String> ls=new HashSet<String>();
		TreeSet<String> ls=new TreeSet<String>();
		ls.add("Gopi2");
		ls.add("Gopi");
		ls.add("Gopi3");
		// Need to be unique in the case of Hash/TreeSet ls.add("Vadlamudi");
		//cannot read through index, 
		//ls.get wont work as this is linked list instead get through element, 
		//use iterator
		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
