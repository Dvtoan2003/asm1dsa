/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demosinglylinked1;

/**
 *
 * @author Admin
 * @param <T>
 */
public class LinkedListStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed element: " + element);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }
        T poppedElement = top.data;
        top = top.next;
        size--;
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return null;
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
