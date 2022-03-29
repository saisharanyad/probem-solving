package trees.programs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {
	
	
	public void levelOrderTraversal(BSTreeNode root) {
		
		BSTreeNode curr = root;
		if(root == null) {
			return;
		}
		
		Queue<BSTreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			BSTreeNode node = queue.poll();
			System.out.print(node.getKey()+",");
			if(node.getLeft() != null) {
				queue.offer(node.getLeft());
			}
			
			if(node.getRight() != null) {
				queue.offer(node.getRight());
			}
			
			
		}
		
		
	}
	
	
	public void levelOrderTraversalNArr(NTreeNode root) {
		
		NTreeNode curr = root;
		if(root == null) {
			return;
		}
		
		Queue<NTreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			NTreeNode node = queue.poll();
			System.out.print(node.getKey()+",");
			for(NTreeNode child:node.getChildren()) {
				queue.offer(child);
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
	   
		
		BFSTree bfs = new BFSTree();
		//bfs.levelOrderTraversal(root);
		
		BuildBSTandNTree treeop = new BuildBSTandNTree();
		NTreeNode rootNode = treeop.buildNTree();
		bfs.levelOrderTraversalNArr(rootNode);
	}

}
