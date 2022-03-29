package trees.programs;

import java.util.LinkedList;
import java.util.List;

public class BuildBSTandNTree {
	

	
	public  BSTreeNode buildBSTree(int key,BSTreeNode root) {
		
		if(root == null) {
			root = new BSTreeNode(key);
			return root;
		}
		
		BSTreeNode curr = root;
		BSTreeNode prev = null;
		while(curr != null) {
			if(curr.getKey() <= key ) {
				prev = curr;
				curr = curr.getRight();
			}else {
				prev = curr;
				curr = curr.getLeft();
			}
			
		}
		
		if(prev.getKey() <= key) {
			prev.setRight(new BSTreeNode(key));
		}else {
			prev.setLeft(new BSTreeNode(key));
		}
		return curr;
	}
	
	
	public NTreeNode buildNTree() {
		
		NTreeNode node1 = new NTreeNode(1,new LinkedList<>());
		
		List<NTreeNode> node2List = new LinkedList<NTreeNode>();
		node2List.add(node1);
		NTreeNode node2 = new NTreeNode(2,node2List);
		
		List<NTreeNode> node6List = new LinkedList<NTreeNode>();
		node6List.add(node2);
		NTreeNode node6 = new NTreeNode(6,node6List);
		
		NTreeNode node15 = new NTreeNode(15,new LinkedList<>());
		
		List<NTreeNode> node5List = new LinkedList<NTreeNode>();
		node5List.add(node15);
		NTreeNode node5 = new NTreeNode(5,node5List);

		List<NTreeNode> firstChildList = new LinkedList<NTreeNode>();
		firstChildList.add(node5);
		firstChildList.add(node6);
		NTreeNode first = new NTreeNode(3,firstChildList);
		
		
		NTreeNode node20 = new NTreeNode(20,new LinkedList<>());
		
		List<NTreeNode> node11List = new LinkedList<NTreeNode>();
		node11List.add(node20);
		NTreeNode node11 = new NTreeNode(11,node11List);
		
		NTreeNode node8 = new NTreeNode(8,new LinkedList<>());

		List<NTreeNode> secondChildList = new LinkedList<NTreeNode>();
		secondChildList.add(node8);
		secondChildList.add(node11);
		NTreeNode second = new NTreeNode(4,secondChildList);
		
		List<NTreeNode> rootChildren = new LinkedList<NTreeNode>();
		rootChildren.add(first);
		rootChildren.add(second);
		NTreeNode rootNode = new NTreeNode(10,rootChildren);
		
		return rootNode;
	}
	
	public static void main(String args[]) {
		BuildBSTandNTree to = new BuildBSTandNTree();
		//to.buildBSTree(23);
		
	}

}
