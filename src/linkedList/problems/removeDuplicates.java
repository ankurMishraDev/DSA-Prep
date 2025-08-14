package linkedList.problems;



//link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

import java.util.LinkedList;



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class removeDuplicates {
    public static void main(String[] args) {
        // Create a sorted linked list: 1 -> 1 -> 2 -> 5 -> 6 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(6);

        head = removeDuplicate(head);

        printList(head);
    }

    static ListNode removeDuplicate(ListNode head){
        if (head == null || head.next == null) return head;
        if (head.val == head.next.val) {
            head.next = head.next.next;
            return removeDuplicate(head);
        }
        head.next = removeDuplicate(head.next);
        return head;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
    }
}
