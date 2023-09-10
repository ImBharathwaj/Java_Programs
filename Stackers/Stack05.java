package Stackers;

public class Stack05 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Stack05(int size){
        // assigning the size of the array
        arr = new int[size];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int num){
        if(top == arr.length - 1){
            System.out.println("Stack is pull");
        }else{
            top++;
            arr[top] = num;
        }
    }

    // Method to pop an element from the stack
    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            return arr[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    // Method to get the top element from the stack
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }

    // Method to get the Maximum value of the stack
    public int get_Max(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }

        int max = arr[0];

        for(int i = 1; i <= top; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Method to get the minimum value of the stack
    public int get_Min(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }

        int min = arr[0];

        for(int i = 1; i <= top; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // Method to display all the elements in the stack
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.print("Stack Elements: ");
            for(int i = top; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Initialize a stack");
        Stack05 stack = new Stack05(10);
        System.out.println("\nInput some elements onto the stack: ");
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.push(-1);
        int max_val = stack.get_Max();
        System.out.println("\nMaximum value in stack: "+max_val);
        int min_val = stack.get_Min();
        System.out.println("\nMinimum value in stack: "+min_val);
    }
}
