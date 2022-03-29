package trees.programs;

public class DeleteNodeBST {
	
	public void delete(int key,BSTreeNode root) {
		BSTreeNode curr = root;
		BSTreeNode prev = null;
	
		while(curr != null) {
			if(curr.getKey() == key) {
				break;
			}else if(curr.getKey() < key) {
				prev = curr;
				curr = curr.getRight();
			}else {
				prev = curr;
				curr = curr.getLeft();
			}
		}
		//if the element is not found
		if(curr == null) {
			return;
		}
		
		
		
		if(curr.getLeft() == null && curr.getRight() == null) {
			System.out.println("in first if "+curr.getKey());
			//if the element to be deleted is a leaf node 
			//set right or left of prev to null
			if(prev != null) {
				if(curr == prev.getRight()) {
					prev.setRight(null);
				}else {
					prev.setLeft(null);
				}
			}else {
				//if root node is the node to be deleted
				root = null;
			}
		}
		else if(curr.getLeft() != null && curr.getRight() != null) {
			System.out.println("in 2nd if "+curr.getKey());
			//if the element has 2 child nodes
			//find either successor or predecessor and assign it to prev
			
			BSTreeNode succ = curr.getRight();
			BSTreeNode prevE = curr;
			
			while(succ.getLeft() != null) {
				prevE = succ;
				succ = succ.getLeft();
			}
			
			curr.setKey(succ.getKey());
			if(succ == prevE.getRight()) {
				prevE.setRight(succ.getRight());
			}else {
				prevE.setLeft(succ.getRight());
			}
			
		}
		else if(curr.getLeft() == null || curr.getRight() != null) {
			System.out.println("in 3rd if "+curr.getKey());
			//if the element to be deleted has only one child node(right)
			//set the child of curr to prev
			
			if(curr == prev.getRight()) {
				prev.setRight(curr.getRight());
			}else {
				prev.setLeft(curr.getRight());
			}
			
		}else if(curr.getLeft() != null || curr.getRight() == null) {
			
			//if the element to be deleted has only one child node(left)
			//set the child of curr to prev
			
			if(curr == prev.getRight()) {
				prev.setRight(curr.getLeft());
			}else {
				prev.setRight(curr.getLeft());
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
	    
		DeleteNodeBST delete = new DeleteNodeBST();
		delete.delete(3,root);
		delete.delete(9,root);
		delete.delete(13,root);
		delete.delete(10,root);
		
		SearchBST search = new SearchBST();
		search.searchRecursive(9,root);
		search.searchRecursive(13,root);
		search.searchRecursive(10,root);
		search.searchRecursive(3,root);
	}

}
