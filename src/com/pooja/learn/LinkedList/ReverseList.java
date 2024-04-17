package com.pooja.learn.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode priv=null;

        while(temp!=null){
            ListNode front=temp.next;
            temp.next=priv;
            priv=temp;
            temp=front;
        }
        return priv;

    }


    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(-2);
       // head.next.next.next.next = new ListNode(5);
        ListNode ans = reverse(head);
        ans.printList("My List",ans);

    }

}

