package stack;

//import java.util.Arrays;

class StackUsingArray{
	private int top=0;
	private int maxSize;
	private int [] stack;
	
	public StackUsingArray(int size) {
		this.maxSize=size;
		stack=new int[maxSize];
		top=-1;
	}
	
	public void push(int data) {
        //if (top == stack.length - 1) 
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }
	
	public void pop() {
        //if (top == -1)
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Removed: " + stack[top--]);
    }

	
	public void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stack[top]);
    }
	
	
	public boolean isFull() {
		return top ==maxSize;
	}
	public boolean isEmpty() {
		return top ==-1;
	}


	

	public static void main(String[] args) 
	{
		StackUsingArray stack= new StackUsingArray(5);
		
		stack.push(10);
		System.out.print("Added: ");
		stack.peek();
		
		stack.push(20);
		System.out.print("Added: ");
		stack.peek();
		
		stack.push(30);
		System.out.print("Added: ");
		stack.peek();
		
		stack.push(40);
		System.out.print("Added: ");
		stack.peek();
		
		stack.push(50);
		System.out.print("Added: ");
		stack.peek();
		//stack.push(60);  //stack overflow
		//stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		//stack.pop(); // error: stack underflow
		
		//System.out.println("Stack:"+Arrays.toString(stack));
		

	}

}


