package trees.programs;

import java.util.List;

public class PostPreOrderTraversalNTree {

	public void postOrderNTree(NTreeNode root) {
		
		if(root == null) {
			return;
		}
		
		List<NTreeNode> children = root.getChildren();
		//System.out.print(root.getKey()+",");
		for(NTreeNode child : children) {
			postOrderNTree(child);
		}
		System.out.print(root.getKey()+",");
	}
	
	
	public static void main(String args[]) {
	
		PostPreOrderTraversalNTree post = new PostPreOrderTraversalNTree();
		
		BuildBSTandNTree treeop = new BuildBSTandNTree();
		NTreeNode rootNode = treeop.buildNTree();
		post.postOrderNTree(rootNode);
	}
}
