package com.epam.dsa;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
		
	    if (current == null) {
	        return new Node(value);
	    }

	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } 
	    else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } 
	    else {
	        return current;
	    }

	    return current;
	}
    
    public void add(int value) {
	    root = addRecursive(root, value);
	}
}

public class LongestPath {

	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();

		binaryTree.add(7);
		binaryTree.add(5);
		binaryTree.add(9);
		binaryTree.add(4);
		binaryTree.add(6);
		binaryTree.add(8);
		binaryTree.add(10);
	    
	    System.out.println("Height = " + getLongestPath(binaryTree.root));
	    System.out.println("LongestPathLength = " + ans);

	}
	
	static int ans = 0;
	private static int getLongestPath(Node root) {
		
		if(root == null) return 0;
		int leftHeight = getLongestPath(root.left);
		int rightHeight = getLongestPath(root.right);
		
		ans = Math.max(ans, leftHeight + rightHeight + 1);
		
		return Math.max(leftHeight, rightHeight) + 1;
		
	}
}


