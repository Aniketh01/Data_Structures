package BinarySearchTree;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		}
		else if (data <= node.getData()) {
			node.left = insert(node.left, data);
		}
		else if (data >= node.getData()) {
			node.right = insert(node.right, data);
		}
		else {
			return node;
		}
		return node;
		
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}

}
