package BinarySearchTree;

public class Node {
	private int Data;
	private Node left;
	private Node right;
	
	public Node() {
		Data = 0;
		left = null;
		right = null;
	}
	
	public Node(int Data) {
		this.Data = Data;
		left = null;
		right = null;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	
	public void setData(int Data) {
		this.Data = Data;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public int getData() {
		return Data;
	}
}
