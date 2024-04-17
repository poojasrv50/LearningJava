package com.pooja.learn.StackQueue;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> myStack1 ;
    Stack<Integer> myStack2;
    public MyQueue() {
        myStack1 = new Stack<>();
        myStack2 = new Stack<>();
    }
    public void push(int x) {
       while(!myStack1.isEmpty()){
           myStack2.push(myStack1.pop());
       }
        myStack1.push(x);
       while(!myStack2.isEmpty()){
           myStack1.push(myStack2.pop());
       }

    }

    public int pop() {
        return myStack1.pop();

    }
    public int peek() {
        return myStack1.peek();
    }

    public boolean empty() {
        return myStack1.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println( obj.pop());


    }
}
