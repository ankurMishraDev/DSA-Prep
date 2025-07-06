package Queue;

import Stack.CustomStack;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int value) {
        this.data = new int[value];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean add(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        data[end++] = item;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        int removedElement = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removedElement;
    }

    public int frontElement(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        System.out.print("[");
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.print("]\n");
    }
}
