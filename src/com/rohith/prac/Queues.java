package com.rohith.prac;

public class Queues {

    int capacity;
    int front;
    int rear, size;
    int array[];

    public Queues(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    void enqueue (int item) {
        rear = (rear+1)%capacity;
        array[rear] = item;
        size = size+1;
    }

    int dequeue() {
        int data = array[front];
        front = (front+1)%capacity;
        size--;
        return data;
    }

    public static void main(String[] args) {
        Queues queues = new Queues(5);
        queues.enqueue(3);
        queues.enqueue(4);
        queues.enqueue(5);
        queues.enqueue(6);
        queues.dequeue();
        queues.dequeue();
        /*queues.enqueue(3);
        queues.enqueue(3);
        queues.enqueue(3);*/

        for (int i: queues.array) {
            System.out.print(i + " ");
        }

    }

}
