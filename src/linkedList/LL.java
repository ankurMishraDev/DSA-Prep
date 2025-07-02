package linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void addLast(int value){
        if(tail == null) addFirst(value);
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void add(int val, int index){
        if(index==0) addFirst(val);
        else if (index == size) addLast(val);
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
