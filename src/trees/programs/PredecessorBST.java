package trees.programs;

public class PredecessorBST {
	
	
	public void predecessor(BSTreeNode root,BSTreeNode keyNode) {
		
		
		BSTreeNode element = keyNode;
		BSTreeNode pred = element.getLeft();
		
		if(pred != null) {
			while(pred.getRight() != null) {
				pred = pred.getRight();
			}
			System.out.println("pred ::: "+pred.getKey());
		}else {
			BSTreeNode curr = root;
			BSTreeNode anscestor = null;
			while(curr != null) {
				if(curr.getKey() == keyNode.getKey()) {
					break;
				}
				else if(curr.getKey() < keyNode.getKey()) {
					anscestor = curr;
					curr = curr.getRight();
				}else {
					curr = curr.getLeft();
				}
			}
			if(anscestor != null) {
				System.out.println(anscestor.getKey());
			}else {
				System.out.println("no predecessor");
			}
			
		}
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
	    
	    BSTreeNode deleteNode = null;
	    SearchBST search = new SearchBST();
	    deleteNode = search.search(0,root);
		
	    
	    PredecessorBST pred = new PredecessorBST();
	    pred.predecessor(root,deleteNode);
	}

}
