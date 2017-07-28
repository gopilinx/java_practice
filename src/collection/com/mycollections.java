package collection.com;

import java.util.ArrayList;

public class mycollections {
	public static void main(String[] args){
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("developer");
		ar.add("tester");
		ar.add("manager");
		ar.remove(1);
		for(String st:ar)
			System.out.println(st);
		//array class, string of array
		ArrayList<employee> emp=new ArrayList<employee>();
		emp.add(new employee("gopi", 34));
		emp.add(new employee("Gopi2", 34));
		emp.add(new employee("Gopi3", 34));
		for(employee st:emp)
			//System.out.println(st.name);
			//System.out.println(st.age);
			System.out.println("Name:"+st.name + ", Age:"+ st.age);
	}
	
	static class employee{
		String name;
		int age;
		public employee(String name, int age){
			this.name=name;
			this.age=age;
		}
	}
}
