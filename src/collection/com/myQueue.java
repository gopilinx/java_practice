package collection.com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class myQueue {

	public static void main(String[] args) {
		System.out.println("basic queue");
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(15);
		q.add(12);
		q.add(13);
		q.add(10);
		System.out.println(q.poll());
		
		System.out.println("priority queue");
		
		PriorityQueue<Integer> qp = new PriorityQueue<Integer>();
		qp.add(15);
		qp.add(12);
		qp.add(13);
		qp.add(10);
		
		System.out.println(qp.poll());
		
		PriorityQueue<Student> qpStudent = new PriorityQueue<Student>();
		//Boolean x=qpStudent.add(new Student("Gopi",34));
		qpStudent.add(new Student("Gopi",34));
		qpStudent.add(new Student("Gopi2",30));
		qpStudent.add(new Student("Gopi3",5));
		qpStudent.add(new Student("Gopi4",1));
		
		System.out.println(qpStudent.poll().name);
		
	}

}
