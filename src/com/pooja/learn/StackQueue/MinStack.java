package com.pooja.learn.StackQueue;

import java.util.*;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> temp;
   int min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(val < min){
            stack.push(min);
            min = val;
        }

        stack.push(val);
    }

    public void pop() {
        if(stack.pop() == min) min = stack.pop();
        else stack.pop();
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
     return min;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.stack);
        System.out.println(obj.getMin());
        obj.pop();
        obj.top();
        System.out.println(obj.stack);
        System.out.println(obj.getMin());
    }

}
