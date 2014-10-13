package data_struct.binary_tree;

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
	public BinaryTree(){
		size=0;
		root=new Node<T>();
	}
	public BinaryTree(T data){
		root=new Node<T>(data);
		size=1;
	}
	public int Size(){
		return size;
	}
	public void insert(T data){
		if(size==0){
			root.setData(data);
			size++;
		}else{
			insert(root,data);
		}
	}
	private void insert(Node<T> node,T data){
		if(node.getData().compareTo(data)==-1){
			if(node.getRightNode()==null){
				node.setRightNode(new Node<T>(data));
				size++;
			}else{
				insert(node.getRightNode(),data);
			}
		}else{
			if(node.getLeftNode()==null){
				node.setLeftNode(new Node<T>(data));
				size++;
			}else{
				insert(node.getLeftNode(),data);
			}
		}
	}
	boolean content(T data){
		boolean content=false;
		return content;
	}
}
