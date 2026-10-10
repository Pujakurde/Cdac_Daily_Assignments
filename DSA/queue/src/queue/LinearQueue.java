 package queue;

class Queue {

    private int queue[];
    int front;
    int rear;
    int maxSize;

    public Queue(int size) {
        this.maxSize = size;
        this.queue = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enque(int data) {
        if (!isFull()) {
            queue[++rear] = data;
        } else {
            System.out.println("Queue is Full...");
        }
    }
    public int peek() {
        return queue[front];
    }

    public int deque() {
        if (!isEmpty()) {
            return queue[front++];
        } else {
            System.out.println("Queue is Empty...");
            return -1;
        }
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }
}

public class LinearQueue {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enque(10);
        System.out.println("Added: "+queue.peek());
        
        queue.enque(20);
        System.out.println("Added: "+queue.peek());
        
        queue.enque(30);
        System.out.println("Added: "+queue.peek());
        
        queue.enque(40);
        System.out.println("Added: "+queue.peek());
        
        queue.enque(50);
        System.out.println("Added: "+queue.peek());

        queue.enque(60); // Queue Full

        System.out.println(queue.deque()); // 10
        System.out.println(queue.deque()); // 20
        System.out.println(queue.deque()); // 30
    }
}