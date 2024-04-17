package com.pooja.learn.StackQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    Queue<Integer> myQueue1 ;
    Queue<Integer> myQueue2 ;

    public MyStack(){
        myQueue1 = new ArrayDeque<>();
        myQueue2 = new ArrayDeque<>();
    }

    public void push(int x) {
        while(!myQueue1.isEmpty()){
            myQueue2.add(myQueue1.poll());
        }
        myQueue1.add(x);

        while(!myQueue2.isEmpty()){
            myQueue1.add(myQueue2.poll());
        }

    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.myQueue1);
    }


}
