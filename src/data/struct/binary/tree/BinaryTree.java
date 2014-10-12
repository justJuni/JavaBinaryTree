package data.struct.binary.tree;

class Node<T extends Comparable<T> >{
	private T data;
	private Node<T> leftNode;
	private Node<T> rightNode;
	Node(T data){
		this.data=data;
		leftNode=null;
		rightNode=null;
	}
	T getData() {
		return data;
	}
	void setData(T data) {
		this.data = data;
	}
	Node<T> getLeftNode() {
		return leftNode;
	}
	void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}
	Node<T> getRightNode() {
		return rightNode;
	}
	void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}
	
}

public class BinaryTree {
	
}
