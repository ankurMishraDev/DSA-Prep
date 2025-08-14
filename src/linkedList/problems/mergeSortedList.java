package linkedList.problems;

// link: https://leetcode.com/problems/merge-two-sorted-lists/
public class mergeSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(9);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(5);
        head2.next.next.next.next = new ListNode(6);
        head2.next.next.next.next.next = new ListNode(10);

        ListNode newList  = head.val > head2.val ? mergeList(head2, head) : mergeList(head, head2);
        printList(newList);
    }

    static ListNode mergeList(ListNode l1, ListNode l2) {
        while((l1.next!=null) && (l2.next!= null)) {
            if (l1.val > l2.val) {
                int temp = l1.val;
                l1.val = l2.val;
                l2.val = temp;
            }
                ListNode node = new ListNode(l2.val);
                node.next = l1.next;
                l1.next = node;
                l1 = node;
                l2 = l2.next;
        }
        if(l2.next!=null){
            l1.next = l2;
        }
        return l1;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
    }
}