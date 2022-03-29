package trees.programs;

public class InOrderTraversal {
	
	//non-decreasing and non-increasing order
	public void inOrderRecursion(BSTreeNode root) {
		if(root == null) {
			return;
		}
		
		inOrderRecursion(root.getRight());	
		System.out.print(root.getKey()+",");
		inOrderRecursion(root.getLeft());
		
	}
	
	public static void main(String args[]) {
		
		BuildBSTandNTree bt = new BuildBSTandNTree();
		BSTreeNode root = null;
	    root = bt.buildBSTree(10,root);
	    bt.buildBSTree(7,root);
	    bt.buildBSTree(9,root);
	    bt.buildBSTree(15,root);
	    bt.buildBSTree(0,root);
	    bt.buildBSTree(27,root);
	    bt.buildBSTree(13,root);
	    bt.buildBSTree(11,root);
	    
		InOrderTraversal inorder = new InOrderTraversal();
		inorder.inOrderRecursion(root);
	}

}
