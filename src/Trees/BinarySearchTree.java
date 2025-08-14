package Trees;

public class BinarySearchTree {
    public static class Node {
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

    public BinarySearchTree() {
    }

    public int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }
    public void populate(int[]nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.value) node.left = insert(val, node.left);
        if (val > node.value) node.right = insert(val, node.right);
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null)return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&&balanced(node.right);
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
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int [] nums= {5,2,7,1,4,6,9,8,3,10};
        bst.populate(nums);
        bst.display();
        System.out.println(bst.balanced());
        System.out.print("Preorder: "  );
        bst.preOrder();
        System.out.println(" ");
        System.out.print("Inorder: "  );
        bst.inOrder();
        System.out.println(" ");
        System.out.print("Postorder: ");
        bst.postOrder();
        System.out.println(" ");
    }
}
