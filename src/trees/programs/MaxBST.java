package trees.programs;

public class MaxBST {
	
	
	public void findMax(BSTreeNode root) {
		
		if(root == null) {
			return;
		}
		BSTreeNode curr = root;
		while(curr.getRight() != null) {
			curr = curr.getRight();
		}
		
		System.out.println(curr.getKey());
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
	    
		MaxBST max = new MaxBST();
		max.findMax(root);
	}

}
