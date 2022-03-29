package trees.programs;

public class SearchBST {
	
	
	public BSTreeNode search(int key,BSTreeNode root) {
		BSTreeNode curr = root;
		
		while(curr != null) {
			if(curr.getKey() == key) {
				System.out.println("Key found "+key);
				return curr;
			}else if(curr.getKey() < key){
				curr = curr.getRight();
			}else {
				curr = curr.getLeft();
			}
		}
		System.out.println("key not found");
		return curr;
	}
	
	
	public void searchRecursive(int key,BSTreeNode root) {
		
			if(root == null) {
				System.out.println("key not found");
				return;
			}
		
			BSTreeNode curr = root;
		
			if(curr.getKey() == key) {
				System.out.println("Key found "+key);
				return;
			}else if(curr.getKey() < key){
				searchRecursive(key,curr.getRight());
			}else {
				searchRecursive(key,curr.getLeft());
			}
		
	}
	
	public static void main(String args[]) {
		BuildBSTandNTree bt = new BuildBSTandNTree();
		BSTreeNode root = null;
	    root = bt.buildBSTree(10,root);
	    bt.buildBSTree(9,root);
	    bt.buildBSTree(11,root);
	    bt.buildBSTree(0,root);
	    bt.buildBSTree(27,root);
	    
		SearchBST search = new SearchBST();
		//search.search(2,root);
		search.searchRecursive(27,root);
	}

}
