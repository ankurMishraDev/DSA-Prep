package Trees;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, -1, -3, 40, 6, 7};
        SegmentTree seg = new SegmentTree(arr);
        seg.display();
        System.out.println(seg.query(0,2));
        seg.update(2,10);
        seg.display();
    }

    private static class Node {
        int value;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int s, int e) {
        if (s == e) {
            Node leaf = new Node(s, e);
            leaf.value = arr[s];
            return leaf;
        }
        //create a new node with the index you are at
        Node node = new Node(s, e);
        int m = s + (e - s) / 2;
        node.left = this.constructTree(arr, s, m);
        node.right = this.constructTree(arr, m + 1, e);
        node.value = node.left.value + node.right.value;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = " ";
        //left node
        if (node.left != null) {
            str = str + " Interval = [ " + node.left.startInterval + " - " + node.left.endInterval + " ] and data: " + node.left.value;
        } else {
            str = str + "No left child";
        }
        //for every node
        str = str + " Interval = [ " + node.startInterval + " - " + node.endInterval + " ] and data: " + node.value;
        //right node
        if (node.right != null) {
            str = str + " Interval = [ " + node.right.startInterval + " - " + node.right.endInterval + " ] and data: " + node.right.value;
        } else {
            str = str + "No right child";
        }
        System.out.println(str+"\n");
        if (node.left != null) display(node.left);
        if (node.right != null) display(node.right);
    }

    //query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        //node completely lying inside a query
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.value;
        } else if (node.startInterval > qsi || node.endInterval<qei) {
            //node completely outside
            return 0;
        }
        else {
            return this.query(node.left, qsi,qei)+this.query(node.right,qsi,qei);
        }
    }

    public void update(int index, int value){
        this.root.value = update(this.root, index, value);
    }
    private int update(Node node, int index, int val){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.value = val;
                return node.value;
            }else{
                int left = update(node.left, index, val);
                int right = update(node.right, index, val);
                node.value = left+right;
                return node.value;
            }
        }
        return node.value;
    }
}
