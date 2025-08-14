package linkedList.problems;

// link: https://leetcode.com/problems/linked-list-cycle-ii/description/
public class LinkedListCycle2 {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        s =  cycle(s,f);
        if(s==null) return null;
        while(f!=s){
            f= f.next;
            s= s.next;
        }
        return f;

    }
    static ListNode cycle(ListNode slow, ListNode fast) {
        if (fast == null || fast.next == null) return null;
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return slow;
        return cycle(slow, fast);
    }
}
