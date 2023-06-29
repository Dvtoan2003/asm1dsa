/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demosinglylinked1;

/**
 *
 * @author Admin
 */
public class Queue {
    private final int maxSize; // maximum size of the queue
    private final int[] queueArray; // array to store elements
    private int front; // index of the front element
    private int rear; // index of the rear element
    private int currentSize; // current number of elements in the queue

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Unable to enqueue element.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = element;
        currentSize++;
        System.out.println("Enqueued element: " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to dequeue element.");
            return -1; // Return a default value or throw an exception in a real-world scenario
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        System.out.println("Dequeued element: " + dequeuedElement);
        return dequeuedElement;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1; // Return a default value or throw an exception in a real-world scenario
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Front element: " + queue.front());
        System.out.println("Queue size: " + queue.size());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element: " + queue.front());
        System.out.println("Queue size: " + queue.size());
    }
}

