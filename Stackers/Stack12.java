package Stackers;

public class Stack12 {
    private int[] arr;
    private int top;

    public Stack12(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    // Method to get the top element of the stack
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

    public void rotate_Stack_To_Left(int rotations) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        rotations = rotations % (top + 1);
        for (int i = 0; i < rotations; i++) {
            int temp = arr[top];
            for (int j = top; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    public static void main(String[] args){
        System.out.println("Initialize a stack:");
        Stack12 stack = new Stack12(7);
        System.out.println("Input some elements on the stack:");
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.display();
        System.out.println("\nRotate the stack elements to the right by 1 position:");
        stack.rotate_Stack_To_Left(1);
        System.out.println("Display the rotated stack:");
        stack.display();
        System.out.println("\nRotate the stack elements to the right by 2 positions:");
        stack.rotate_Stack_To_Left(2);
        System.out.println("Display the rotated stack:");
        stack.display();
        System.out.println("\nRotate the stack elements to the right by 3 positions:");
        stack.rotate_Stack_To_Left(3);
        System.out.println("Display the rotated stack:");
        stack.display();
    }
}

