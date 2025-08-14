package Trees;

import java.util.Arrays;

public class AVLTree {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.value) node.left = insert(val, node.left);
        if (val > node.value) node.right = insert(val, node.right);
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }
    public Node rotate(Node node){
        //left heavy
        if (height(node.left) - height(node.right) > 1) {
            //left-left case
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            //left-right case
            if (height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //right heavy
        if (height(node.left) - height(node.right) < 1) {
            //right-right case
            if (height(node.right.left) - height(node.right.right) < 0) {
                return leftRotate(node);
            }
            //right-left case
            if (height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;
        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        c.right = t;
        p.left = c;
        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return p;
    }
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void display(){
        display(this.root,"Root Node: ");
    }
    private void display(Node node, String str){
        if(node==null)return;
        System.out.println(str+node.value);
        display(node.left,"Left child of "+ node.value+": ");
        display(node.right,"Right child of "+ node.value+": ");
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null)return;
        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null)return;
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null)return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+ " ");
    }
    public AVLTree() {
    }
    public  void printTree() {
        printTree(root, 0);
    }

    private  void printTree(Node node, int level) {
        if (node == null) return;

        printTree(node.right, level + 1);

        System.out.println("    ".repeat(level) + "|-- " + node.value + " (h=" + node.height + ")");

        printTree(node.left, level + 1);
    }
    public static void main(String[] args) {
        AVLTree avt = new AVLTree();
        int[]nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i]=i;
        }
        avt.populate(nums);
//        avt.printTree();
        avt.display();
//        avt.printTree();
        System.out.println(Arrays.toString(nums));
    }
}
