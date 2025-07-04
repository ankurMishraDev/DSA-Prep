package linkedList;



public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void addAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) head.prev = node;
        head = node;
        size++;
    }
    public void addAtLast(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void addAfterAnyNode(int after, int value){
        Node prevNode = find(after);
        Node node = new Node(value);
        node.prev = prevNode;
        node.next = prevNode.next;
        if(prevNode.next != null){
            prevNode.next.prev = node;
        }
        prevNode.next = node;
    }

    public int deleteAtFirst(){
        int val = head.value;
        head = head.next;
        head.prev = null;
        return val;
    }
    public int deleteAtLast(){
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        int val = temp.value;
        temp.prev.next = null;
        return val;
    }
    public void display() {
        Node temp = head;
        Node last = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("List in Reverse");
        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value) return node;
            node = node.next;
        }
        return null;
    }



    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
