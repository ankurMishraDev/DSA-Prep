package linkedList;

public class Initial {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(12);
        list.addLast(23);
        list.add(7,1);
        list.add(9,2);
        list.add(5,3);
        list.add(38,4);
        list.addLast(43);
        list.addLast(53);
        list.addLast(8);
        list.addLast(11);
        list.printList();
        System.out.println(list.deleteAtFirst());
        list.printList();
        System.out.println(list.deleteAtLast());
        list.printList();
        System.out.println(list.delete(3));
        list.printList();
    }
}
