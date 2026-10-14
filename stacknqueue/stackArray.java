package stacknqueue;
import java.util.*;
public class stackArray {
    int[] stack;
    int top;
    int capacity;

    // Constructor
    stackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Insert element
    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    // Remove element
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(stack[top--] + " popped");
    }

    // View top element
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        stackArray s = new stackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
