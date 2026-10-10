package queue;

class CirQueue{

    private int queue[];
    int front;
    int rear;
    int maxSize;
    int count=0;

    public CirQueue(int size) {
        this.maxSize = size;
        this.queue = new int[maxSize];
        front = 0;
        rear = -1;
        count=0;
        
    }

    public void enque(int data) {
        if (!isFull()) {
        	rear=(rear+1)%maxSize;
            queue[rear] = data;
            count++;
        } 
        else {
            System.out.println("Queue is Full...");
        }
    }
    public int peek() {
        return queue[front];
    }

    public int deque() {
        if (!isEmpty()) {
        	int data=queue[front];
        	front=(front+1)%maxSize;
        	count--;
            return data;
            
        } 
        else {
            System.out.println("Queue is Empty...");
            return -1;
        }
    }

    public boolean isFull() {
        return count == maxSize ;
    }

    public boolean isEmpty() {
        return count==0;
    }
}

public class CircularQueue {
	 public static void main(String[] args) {

		 	CirQueue queue = new CirQueue(5);

		 	queue.enque(10);
	        queue.enque(20);
	        queue.enque(30);
	        queue.enque(40);
	        queue.enque(50);
	        System.out.println("Removed from queue: "+queue.deque()); // 10
		 	System.out.println("Front now: "+queue.peek());
	        queue.enque(60); // Queue Full

	        //System.out.println("Removed from queue: "+queue.deque()); // 10
	        System.out.println("Removed from queue: "+queue.deque()); // 20
	        System.out.println("Removed from queue: "+queue.deque()); // 301
	        
	        queue.enque(60);
	        System.out.println("Front now: "+queue.peek());
	        // System.out.println(queue.toString());
	   }
}

   