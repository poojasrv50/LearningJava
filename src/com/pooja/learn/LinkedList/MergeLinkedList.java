package com.pooja.learn.LinkedList;

public class MergeLinkedList {

    public static ListNode merge(ListNode node1, ListNode node2) {

        ListNode head;
        if (node1.value < node2.value) {
            head = node1;
            node1 = node1.next;
        } else{
            head = node2;
        node2 = node2.next;}
        ListNode node = head;
        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {
                node.next = node1;
                node1 = node1.next;
            } else {
                node.next = node2;
                node2 = node2.next;
            }
            node = node.next;
        }
        while (node1 != null) {
            node.next = node1;
            node1 = node1.next;
            node = node.next;
        }
        while (node2 != null) {

            node.next = node2;
            node2 = node2.next;
            node = node.next;
        }

        return head;
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(-9);
        head1.next = new ListNode(3);
     //   head1.next.next = new ListNode(15);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(7);
     //   head2.next.next = new ListNode(20);

        ListNode ans = merge(head1, head2);
        ans.printList("MERGED LIST: ", ans);
    }
}




