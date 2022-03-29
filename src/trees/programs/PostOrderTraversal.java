package trees.programs;

public class PostOrderTraversal {

	public void postOrderRecursion(BSTreeNode root) {
		if(root == null) {
			return;
		}
				
		postOrderRecursion(root.getLeft());
		postOrderRecursion(root.getRight());
		System.out.print(root.getKey()+",");
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
	    
	    PostOrderTraversal postOrder = new PostOrderTraversal();
		postOrder.postOrderRecursion(root);
	}

}
