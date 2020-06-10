package com.company;

public class CircularQueueLinkedList {
    class Node {
        int data;
        Node next = null;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;
    public void insert(int number){
        Node newNode = new Node(number);
        if (front == null && rear == null){
            front = rear = newNode;
            newNode.next = null;
        }
        else {
            rear.next = newNode;
            rear = newNode;
            newNode.next = front;
        }
    }
    public void delete(){
        if (front == null){
            System.out.println("Underflow");
        }
        else if (front == rear){
            int temp = front.data;
            front = rear = null;
        }
        else {
            int temp = front.data;
            front = front.next;
            rear.next = front;
        }
    }
    public void peek(){
        if (front == null){
            isEmpty();
        }
        else {
            System.out.println(front.data);
        }
    }
    public void isEmpty(){
        if (front == null){
            System.out.println("Empty");
        }
        else {
            System.out.println("Not Empty");
        }
    }
    public void display(){
        Node temp = front;
        while (temp.next != front){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        CircularQueueLinkedList cq = new CircularQueueLinkedList();
        cq.isEmpty();
        cq.insert(10);
        cq.insert(20);
        cq.insert(15);
        cq.display();
        cq.peek();
        cq.delete();
        cq.display();
        cq.peek();
        cq.delete();
        cq.peek();
        cq.delete();
        cq.peek();
        cq.isEmpty();
        cq.delete();
    }
}
