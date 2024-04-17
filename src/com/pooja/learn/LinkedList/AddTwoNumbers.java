package com.pooja.learn.LinkedList;

public class AddTwoNumbers {

    public static ListNode addLinkedList(ListNode l1, ListNode l2) {
        if (l1.next == null) return l2;
        if (l2.next == null) return l1;
        int carryOver = 0;
        int num = l1.value + l2.value + carryOver;
        carryOver = num / 10;
        ListNode n3 = new ListNode(num % 10);
        ListNode head = n3;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            num = l1.value + l2.value + carryOver;
            carryOver = num / 10;
            n3.next = new ListNode(num % 10);
            n3 = n3.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 == null && l2 != null) {
            num = l2.value + carryOver;
            carryOver = num / 10;
            n3.next = new ListNode(num % 10);
            n3 = n3.next;
            l2 = l2.next;
        }
        while (l1 != null && l2 == null) {
            num = l1.value + carryOver;
            carryOver = num / 10;
            n3.next = new ListNode(num % 10);
            n3 = n3.next;
            l1 = l1.next;
        }
        if(carryOver != 0){
            n3.next = new ListNode(carryOver);
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode ans = addLinkedList(l1, l2);
        ans.printList("ans", ans);

    }
}


