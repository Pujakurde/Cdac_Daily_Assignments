package linkedlist;

public class StackUSingLinkedList {
	Node top;
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void push(int data) {
		Node newNode= new Node(data);
		if(top==null) {
			top=newNode;
			return;
		}
		newNode.next=top;
		top=newNode;
	}
	
	public int pop() {
		Node temp=top;
		//now top is next node
		top=top.next;
		int data=temp.data;
		temp.next=null;
		return data;
	}
	
	public int peek() {
		Node temp=top;
		//if(temp.next==null)
		if(top==null){
			System.out.println("Empty stack!!!Nothing to peek.");
			return -1;
		}
		return temp.data;
	}
	
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		StackUSingLinkedList stackll= new StackUSingLinkedList();
		
		System.out.println("Stack: ");
		
		stackll.push(10);
		stackll.push(20);
		stackll.push(30);
		stackll.push(40);
		
		stackll.display();
		
		System.out.println("Top is: "+ stackll.peek());
	
		stackll.pop();
		
		System.out.println("Stack after pop: ");
		stackll.display();
		
		

	}

}
