package Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    public void addNode(Scanner sc){
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    public void populate(Scanner sc, Node node){
        System.out.println("You want to insert at left of: "+ node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of node: ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }
        System.out.println("You want to insert at right of: "+ node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of node: ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc,node.right);
        }
    }
    public void display(){
        display(root,0);
    }
    public void display(Node node, int level){
        if (node == null) return;

        display(node.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.value);

        display(node.left, level + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.addNode(sc);
        bt.display();
    }
}
