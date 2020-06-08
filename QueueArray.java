package com.company;

public class QueueArray {
    int front = -1;
    int rear = -1;
    int max = 1000;
    int[] queue = new int[max];
    public void insert(int number){
        if (rear == max-1){
            System.out.println("Overflow");
        }
        else if (front == -1 && rear == -1){
            front = rear = 0;
            queue[rear] = number;
        }
        else {
            rear = rear + 1;
            queue[rear] = number;
        }
    }
    public void delete (){
        if (front == -1 || front > rear){
            System.out.println("Underflow");
        }
        else {
            int temp = queue[front];
            front = front + 1;
        }
    }
    public void peek (){
        if (front == -1 || front > rear){
            System.out.println("Null");
        }
        else {
            System.out.println(queue[front]);
        }
    }
    public void display(){
        for (int i = front; i <= rear; i++){
            System.out.print(queue[i] + " ");
        }
    }
    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.insert(10);
        queue.insert(15);
        queue.insert(12);
        queue.display();
        queue.peek();
        queue.delete();
        queue.display();
        queue.peek();
        queue.delete();
        queue.display();
        queue.peek();
        queue.delete();
        queue.display();
        queue.peek();
    }
}
