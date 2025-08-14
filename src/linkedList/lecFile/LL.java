package linkedList.lecFile;

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

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
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
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
        return node;
    }
    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
       return value;
    }

    public int deleteAtLast(){
        if(size<=1) deleteAtFirst();
        Node node = get(size-1);
        int value = tail.value;
        tail = node;
        tail.next = null;
        return value;
    }

    public int delete(int index){
        if (index==0) deleteAtFirst();
        else if (index==size-1) deleteAtLast();
        Node node = get(index);
        int val = node.next.value;
        node.next = node.next.next;
        return val;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
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

