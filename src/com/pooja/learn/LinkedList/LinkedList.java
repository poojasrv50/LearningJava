package com.pooja.learn.LinkedList;

public class LinkedList {
    public static ListNode getList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            head.next = new ListNode(arr[i]);
            head = head.next;
        }
        return temp;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        ListNode head = getList(arr);

    }
}

class ListNode {
    int value;
    ListNode next;


    ListNode(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.valueOf(value).toString();
    }

    public void printList(String message, ListNode head){
        System.out.print(message);
        while(head!=null){
            System.out.print(head+"->");
            head = head.next;
        }
    }
}
