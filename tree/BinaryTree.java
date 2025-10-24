package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;
    
    public void createTree() {
 
        Node node1 = new Node(5);
        Node node2 = new Node(10);
        Node node3 = new Node(15);
        Node node4 = new Node(20);
        Node node5 = new Node(30);

        root = node2;        // Root node with value 10
        node2.left = node1;  // 10 left is 5
        node2.right = node3; // 10 right is 15
        node1.left = node4;  // 5 left is 20
        node3.right = node5; // 15 right is 30
    }

    // Level Order Traversal (Breadth-First)
    public void levelOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    // Pre-order Traversal (Depth-First)
    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // In-order Traversal (Depth-First)
    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    // Post-order Traversal (Depth-First)
    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createTree();

        System.out.print("Level Order Traversal: ");
        tree.levelOrderTraversal(tree.root);

        System.out.print("Pre-order Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("In-order Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}