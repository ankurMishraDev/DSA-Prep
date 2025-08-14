package linkedList.lecFile;

public class Initial {
    public static void main(String[] args) {
          //Singly Linked List
        LL list = new LL();
        list.insertRec(3,0);
        list.insertRec(2,1);
        list.insertRec(6,2);
        list.printList();
//        list.addFirst(12);
//        list.addLast(23);
//        list.add(7,1);
//        list.add(9,2);
//        list.add(5,3);
//        list.add(38,4);
//        list.addLast(43);
//        list.addLast(53);
//        list.addLast(8);
//        list.addLast(11);
//        list.printList();
//        System.out.println(list.deleteAtFirst());
//        list.printList();
//        System.out.println(list.deleteAtLast());
//        list.printList();
//        System.out.println(list.delete(3));
//        list.printList();

          //Doubly Linked List
//        DLL dllList = new DLL();
//        dllList.addAtFirst(32);
//        dllList.addAtFirst(2);
//        dllList.addAtFirst(7);
//        dllList.addAtFirst(8);
//        dllList.addAtLast(9);
//        dllList.addAtLast(94);
//        dllList.addAtLast(15);
//        dllList.addAfterAnyNode(8,18);
//        dllList.addAfterAnyNode(9,25);
//        dllList.display();
//        System.out.println("Removed element " + dllList.deleteAtFirst());
//        dllList.display();
//        System.out.println("Removed element " + dllList.deleteAtLast());
//        dllList.display();

        //Circular Linked List
        CLL cllList = new CLL();
        cllList.add(23);
        cllList.add(4);
        cllList.add(7);
        cllList.add(17);
        cllList.add(9);
//        cllList.display();
//        cllList.delete(7);
//        cllList.display();
    }
}
