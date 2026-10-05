package reverse;

public class ReverseLLUsingRecursion {
	static Node head ;
	int count = 0;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	} 
	
	public static Node reverseLL(Node list) {
	    if (list == null || list.next == null) {
	        return list;
	    }

	    Node lastNode = reverseLL(list.next);

	    list.next.next = list;
	    list.next = null;

	    return lastNode;
	}
	
	public void addAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            count++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        count++;
    }
	
	public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

	public static void main(String[] args) {
		ReverseLLUsingRecursion linkedList= new ReverseLLUsingRecursion();
		linkedList.addAtEnd(10);
		linkedList.addAtEnd(20);
		linkedList.addAtEnd(30);
		System.out.println("Linkedlist: ");
		linkedList.display();
		head = reverseLL(head);
		System.out.println("Reversed Linked List:");
		linkedList.display();
	}
}
