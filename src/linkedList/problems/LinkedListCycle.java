package linkedList.problems;

// link: https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        ListNode2 pos = new ListNode2();
        head.next = new ListNode2(1);
        head.next.next = new ListNode2(2);
        head.next.next.next = new ListNode2(3);
        head.next.next.next.next = new ListNode2(7);
        head.next.next.next.next.next = new ListNode2(9);
    }
    static boolean cycle(ListNode l,ListNode s, ListNode f, int meet){
        if(f==null||s==null||f.next == null) return false;
        if(meet>1)return true;
        if(f==s ){
            meet++;
        }
        return cycle(l,s.next,f.next.next,meet);
    }
}
 class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; next = null;}
}
