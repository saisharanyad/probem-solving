package trees.programs;

public class SuccessorBST {
	
	public void successor(BSTreeNode root,BSTreeNode keyNode) {
		
		
		BSTreeNode element = keyNode;
		BSTreeNode succ = element.getRight();
		
		if(succ != null) {
			while(succ.getLeft() != null) {
				succ = succ.getLeft();
			}
			System.out.println("succ ::: "+succ.getKey());
		}else {
			BSTreeNode curr = root;
			BSTreeNode anscestor = null;
			while(curr != null) {
				if(curr.getKey() == keyNode.getKey()) {
					break;
				}
				else if(curr.getKey() < keyNode.getKey()) {
					curr = curr.getRight();
				}else {
					anscestor = curr;
					curr = curr.getLeft();
				}
			}
			if(anscestor != null) {
				System.out.println(anscestor.getKey());
			}else {
				System.out.println("no successor");
			}
			
		}
	}
	
	public static  void main(String args[]) {
		BuildBSTandNTree bt = new BuildBSTandNTree();
		BSTreeNode root = null;
	    root = bt.buildBSTree(10,root);
	    bt.buildBSTree(7,root);
	    bt.buildBSTree(9,root);
	    bt.buildBSTree(15,root);
	    bt.buildBSTree(0,root);
	    bt.buildBSTree(6,root);
	    bt.buildBSTree(27,root);
	    bt.buildBSTree(13,root);
	    bt.buildBSTree(11,root);
	    
	    BSTreeNode deleteNode = null;
	    SearchBST search = new SearchBST();
	    //deleteNode = search.search(10,root);
		
	    BSTreeNode keyNode = new BSTreeNode(7);
		SuccessorBST succ = new SuccessorBST();
		succ.successor(root,keyNode);
	}

}
