package linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int count = 0;

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        count++;
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

    public void addAtPosition(int position, int data) {
        if (position < 0 || position > count) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 0) {
            addAtBeginning(data);
            return;
        }

        if (position == count) {
            addAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        count++;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        count--;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            count--;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        count--;
    }

    public void deleteAtPosition(int position) {
        if (position < 0 || position >= count) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 0) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        count--;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.display();
        list.addAtBeginning(5);
        list.addAtBeginning(2);
        
        list.addAtPosition(2, 8);

        list.display();

        list.deleteAtBeginning();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.deleteAtPosition(1);
        list.display();
    }
}