package circularLinkedList;

public class CircularLinkedList {

    Node tail;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }

        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }

        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtPosition(int position, int data) {
        if (position <= 1 || tail == null) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = tail.next;

        for (int i = 1; i < position - 1 && current != tail; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (tail == null) {
            System.out.println("Empty linked list... Nothing to delete");
            return;
        }

        if (tail.next == tail) {
            tail = null;
            return;
        }

        tail.next = tail.next.next;
    }

    public void deleteAtEnd() {
        if (tail == null) {
            System.out.println("Empty linked list... Nothing to delete");
            return;
        }

        if (tail.next == tail) {
            tail = null;
            return;
        }

        Node current = tail.next;

        while (current.next != tail) {
            current = current.next;
        }

        current.next = tail.next;
        tail = current;
    }

    public void deleteAtPosition(int position) {
        if (tail == null) {
            System.out.println("Empty linked list... Nothing to delete");
            return;
        }

        if (position == 1) {
            deleteAtBeginning();
            return;
        }

        Node current = tail.next;

        for (int i = 1; i < position - 1 && current.next != tail.next; i++) {
            current = current.next;
        }

        Node deleteNode = current.next;

        if (deleteNode == tail) {
            deleteAtEnd();
            return;
        }

        current.next = deleteNode.next;
    }

    public void display() {
        if (tail == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(20);
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtBeginning(2);
        list.insertAtPosition(4, 15);

        System.out.println("After Insertion:");
        list.display();

        list.deleteAtBeginning();
        System.out.println("After Delete Beginning:");
        list.display();

        list.deleteAtEnd();
        System.out.println("After Delete End:");
        list.display();

        list.deleteAtPosition(2);
        System.out.println("After Delete Position 2:");
        list.display();
    }
}