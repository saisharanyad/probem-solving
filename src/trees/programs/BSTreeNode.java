package trees.programs;

public class BSTreeNode {
	
	private int key;
	private  BSTreeNode left;
	private BSTreeNode right;
	
	public BSTreeNode(int key) {
		this.key = key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}
	public BSTreeNode getLeft() {
		return left;
	}
	public BSTreeNode getRight() {
		return right;
	}


	public void setLeft(BSTreeNode left) {
		this.left = left;
	}

	public void setRight(BSTreeNode right) {
		this.right = right;
	}
	
	
	

}
