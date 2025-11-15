package gr.aueb.cf.cf9.ch5;

import java.util.Arrays;

import static gr.aueb.cf.cf9.ch5.GenericPrintArray.printArray;

public class StackDemo {

    static int[] stack = new int[4];
    static int top = -1;

    public static void main(String[] args) {
        int num;
        push(7);
        push(12);
        push(19);
        push(20);
        printArray(stack, 0, stack.length - 1);
        System.out.println();
        num = pop();
        System.out.printf("Deleted item (last one entered to the stack): %d\n\n", num);
        printArray(stack, 0, stack.length - 1);

    }

    public static void push(int num) {
        if (isFull()) {
            throw new RuntimeException(("Stack is full"));
        }
        stack[++top] = num;
    }

    public static int pop() {
        int num = 0;
        if (isEmpty()) {
            throw new RuntimeException(("Stack is empty"));
        }
        num = stack[stack.length - 1];
        stack = Arrays.copyOfRange(stack, 0, stack.length - 1);
        return num;
    }

    public static boolean isFull() {
        return (top == stack.length - 1);
    }

    public static boolean isEmpty() {
        return (top == 1);
    }
}
