package data_struct;

class TreeNode<T extends Comparable<T> >{
	private T data;
	private TreeNode<T> leftNode;
	private TreeNode<T> rightNode;
	TreeNode(){
		data=null;
		leftNode=null;
		rightNode=null;
	}
	TreeNode(T data){
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
	TreeNode<T> getLeftNode() {
		return leftNode;
	}
	void setLeftNode(TreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}
	TreeNode<T> getRightNode() {
		return rightNode;
	}
	void setRightNode(TreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
}

public class BinaryTree <T extends Comparable<T>>{
	TreeNode<T> root=null;
	int size;
	public BinaryTree(){
		size=0;
		root=new TreeNode<T>();
	}
	public BinaryTree(T data){
		root=new TreeNode<T>(data);
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
	private void insert(TreeNode<T> node,T data){
		if(node.getData().compareTo(data)==-1){
			if(node.getRightNode()==null){
				node.setRightNode(new TreeNode<T>(data));
				size++;
			}else{
				insert(node.getRightNode(),data);
			}
		}else{
			if(node.getLeftNode()==null){
				node.setLeftNode(new TreeNode<T>(data));
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
