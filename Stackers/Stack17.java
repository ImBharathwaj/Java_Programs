package Stackers;

public class Stack17 {
    private final int[] arr;
    private int top;

    public Stack17(int size){
        arr = new int[size];
        top = -1;
    }

    public void push(int num){
        if(top == arr.length-1){
            System.out.println("Stack is full");
        }else{
            top++;
            arr[top] = num;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    // Method to check if the stack is empty
    @org.jetbrains.annotations.NotNull
    public static Stack17 mergeStack(Stack17 stack1, Stack17 stack2){
        int size1 = stack1.top+1;
        int size2 = stack2.top+1;
        Stack17 mergedStack = new Stack17(size1);

        for(int i = 0; i < size1; i++){
            mergedStack.push(stack1.pop());
        }

        for(int i = 0; i < size2; i++){
            mergedStack.push(stack2.pop());
        }

        mergedStack.push(stack2.pop());

        return mergedStack;
    }

    // Method to display the elements of the stack
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
        Stack17 stack1 = new Stack17(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("\nStack-1");
        stack1.display();
        Stack17 stack2 = new Stack17(5);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        System.out.println("\nStack-2");
        stack2.display();
        System.out.println("\nMerge said two stacks:");
        Stack17 mergedStack = mergeStack(stack1, stack2);
        mergedStack.display();
    }
}
