package com.ds;

public class QueueuDArrayDemo {
	public static void main(String[] args) {
		QueueDArray<Integer> q=new
				QueueDArray<Integer>(2);
		q.Queue(11);
		q.Queue(12);
		System.out.println("Size:"+q.getSize());
		System.out.println("Dequeue:"+q.DeQueue());
		System.out.println("Dequeue:"+q.DeQueue());
		q.Queue(13);
		System.out.println("Dequeue:"+q.DeQueue());
		System.out.println("Size:"+q.getSize());
		
		
	}
}
