package com.company;

public class QueueLinkedList {
    class Node {
        int data;
        Node next;
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
            newNode.next = null;
        }
    }
    public void delete (){
        if (front == null){
            System.out.println("Underflow");
        }
        else if(front == rear) {
            front = rear = null;
        }
        else {
            front = front.next;
        }
    }
    public void peek(){
        if (front == null){
            System.out.println("Null");
        }
        else {
            System.out.println(front.data);
        }
    }
    public void display (){
        Node temp = front;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.insert(10);
        q.insert(15);
        q.insert(12);
        q.display();
        q.peek();
        q.delete();
        q.delete();
        q.delete();
        q.display();
        q.peek();
    }
}
