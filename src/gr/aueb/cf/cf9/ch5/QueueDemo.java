package gr.aueb.cf.cf9.ch5;

import static gr.aueb.cf.cf9.ch5.GenericPrintArray.printArray;

import java.util.Arrays;

public class QueueDemo {

    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        enQueue(20);
        enQueue(7);
        enQueue(12);
        enQueue(19);

        printArray(queue, 0, queue.length - 1);

        num = deQueue();
        printArray(queue, 0, queue.length - 1);
    }

    public static void enQueue(int val) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[++top] = val;
    }

    public static int deQueue() {
        int num = 0;
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        num = queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    public static boolean isFull() {
        return (top == queue.length - 1);
    }

    public static boolean isEmpty() {
        return (top == 1);
    }
}
