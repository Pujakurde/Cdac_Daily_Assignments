package linkedlist;

import linkedlist.StackUSingLinkedList.Node;

public class QueueLinkedList {
	//enque,deque,front,isFull,isEmpty,size
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public void enque(int data) {
		Node newNode=new Node(data);
		//null 
		if(front==null) {
			front=rear=newNode;
			return ;
		}
		rear.next=newNode;
		rear=newNode;
		
	}
	
	public int deque() {
		if(front==null) {
			System.out.println("Queue is empty...Nothing to remove");
			return -1;
		}
		
		int data =front.data;
		front=front.next;
		return data;
	}
	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) {
		QueueLinkedList queueLL=new QueueLinkedList();
		System.out.println("Queue: ");
		queueLL.enque(10);
		queueLL.enque(20);
		queueLL.enque(30);
		queueLL.enque(30);
		queueLL.display();
		queueLL.deque();
		
		System.out.println("Queue after Deque: ");
		queueLL.display();
		
	}
}
