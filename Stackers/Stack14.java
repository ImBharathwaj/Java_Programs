package Stackers;

import java.awt.*;

public class Stack14 {
    private int[] arr;
    private int top;

    public Stack14(int size) {
        arr = new int[size];
        top = -1;
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

    public int getNth(int n){
        if(top-n+1 < 0){
            System.out.println("Invalid element index");
            return -1;
        }
        else{
            return arr[top-n+1];
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack: ");
        Stack14 stack = new Stack14(5);
        System.out.println("Input some elements on the stack");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.getNth(2);
        int n = stack.getNth(2);
        System.out.println("\nThe 2nd element from the top is "+n);
        n = stack.getNth(3);
        System.out.println("\nThe 3rd element from the top is "+n);
    }
}

