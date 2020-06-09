package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    Queue<Integer> queue = new LinkedList<>();
    public void insert(int number){
        queue.add(number);
        System.out.print(number + " ");
    }
    public void delete(){
        int temp = queue.peek();
        queue.remove();
    }
    public void isEmpty(){
        System.out.println(queue.isEmpty());
    }
    public void peek(){
        System.out.println(queue.peek());
    }
    public static void main(String[] args) {
        QueueInterface q = new QueueInterface();
        q.insert(10);
        q.insert(15);
        q.insert(12);
        q.peek();
        q.isEmpty();
        q.delete();
        q.delete();
        q.delete();
        q.isEmpty();
    }
}
