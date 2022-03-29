package trees.programs;

import java.util.List;

public class NTreeNode {
	
	private int key;
	private List<NTreeNode> children;
	
	public NTreeNode(int key,List<NTreeNode> children){
		this.key = key;
		this.children = children;
	}

	public int getKey() {
		return key;
	}

	public List<NTreeNode> getChildren() {
		return children;
	}
	
}
