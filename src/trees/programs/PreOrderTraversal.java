package trees.programs;

public class PreOrderTraversal {

	public void preOrderRecursion(BSTreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.getKey()+",");		
		preOrderRecursion(root.getLeft());
		preOrderRecursion(root.getRight());
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
	    
	    PreOrderTraversal preorder = new PreOrderTraversal();
	    preorder.preOrderRecursion(root);
	}

}
