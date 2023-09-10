package Stackers;

public class Stack06 {
    private final int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Stack06(int size) {
        arr = new int[size];
        top = -1;
    }

    public Stack06(int[] arr) {
        this.arr = arr;
    }

    // Method to push an element onto the stack
    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    // Method to get the element from the top of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public void removeAll() {
        top = -1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Stack06 stack = new Stack06(10);
        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.push(-1);
        stack.display();
        System.out.println("\nRemove all the elements from the stack:");
        stack.removeAll();
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
