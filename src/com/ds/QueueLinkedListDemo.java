package com.ds;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		QueueLinkedList<String> q=new
				QueueLinkedList<String>();
		q.Queue("gopi");
		q.Queue("kumar");
		q.Queue("vad");
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
	}

}
