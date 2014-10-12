package data.struct.binary.tree;

class Node<T extends Comparable<T> >{
	private T data;
	private Node<T> leftNode;
	private Node<T> rightNode;
	Node(){
		data=null;
		leftNode=null;
		rightNode=null;
	}
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

public class BinaryTree <T extends Comparable<T>>{
	Node<T> root=null;
	int size;
	BinaryTree(){
		size=0;
		root=new Node<T>();
	}
	BinaryTree(T data){
		root=new Node<T>(data);
	}
	public void insert(T data){
		if(size==0){
			root.setData(data);
			size++;
		}else{
			
		}
	}
	private void insert(Node<T> node,T data){
		
	}
}
