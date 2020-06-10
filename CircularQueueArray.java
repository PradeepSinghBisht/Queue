package com.company;

public class CircularQueueArray {
    int front = -1;
    int rear = -1;
    int max = 3;
    int[] queue = new int[max];
    public void insert(int number){
        if (front == (rear + 1) % max){
            System.out.print("Overflow ");
        }
        else if (front == -1){
            front = rear = 0;
            queue[rear] = number;
        }
        else {
            rear = (rear + 1) % max;
            queue[rear] = number;
        }
    }
    public void delete(){
        if (front == -1){
            System.out.println("Underflow");
        }
        else if (front == rear){
            front = rear = -1;
        }
        else {
            int temp = queue[front];
            front = (front + 1) % max;
        }
    }
    public void peek(){
        if (front == -1){
            isEmpty();
        }
        else {
            System.out.println(queue[front]);
        }
    }
    public void isEmpty(){
        if (front == -1){
            System.out.println("Empty");
        }
        else {
            System.out.println("Not Empty");
        }
    }
    public void display(){
        if (front == -1){
            isEmpty();
        }
        else if (front <= rear){
            for (int i = front; i <= rear; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = front; i < max; i++){
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        CircularQueueArray cq = new CircularQueueArray();
        cq.insert(10);
        cq.insert(12);
        cq.insert(15);
        cq.insert(25);
        cq.display();
        cq.peek();
        cq.delete();
        cq.display();
        cq.peek();
        cq.isEmpty();
        cq.insert(25);
        cq.display();
        cq.delete();
        cq.display();
        cq.peek();
        cq.delete();
        cq.display();
        cq.delete();
        cq.peek();
        cq.isEmpty();
        cq.delete();
    }
}
