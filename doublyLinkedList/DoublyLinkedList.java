package doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head =newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	public void insertAtPosition(int position,int data) {
		Node newNode=new Node(data);
		Node current=head;
		for(int i=0;i<position-1;i++) {
			current=current.next;
		}
		newNode.next=current.next;
		newNode.prev=current;
		current.next.prev=newNode;
		current.next=newNode;
		
	}
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return ;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;

	}
	
	public void displayForward() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void displayBackward() {
		Node temp=head;
		while(temp!=null) {
			//System.out.println(temp.data);
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.println(temp.data);
		}
		//System.out.print(null);
	}
	

	public static void main(String[] args) {
		

	}

}
