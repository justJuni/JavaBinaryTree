package tree;

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
	public int size(){
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
	public boolean content(T data){
		return content(data,root);
	}
	private boolean content(T data,TreeNode<T> node){
		System.out.println("execute");
		boolean content=false;
		if(node==null || size==0){
			return content;
		}
		else{
			int compare=node.getData().compareTo(data);
			switch(compare){
				case -1:
					content=content(data,node.getRightNode());
					break;
				case 0:
					content=true;
					break;
				case 1:
					content=content(data,node.getLeftNode());
					break;
			}
		}
		return content;
	
	}
}
