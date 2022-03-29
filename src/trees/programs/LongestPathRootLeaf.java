package trees.programs;

import java.util.ArrayList;
import java.util.List;

public class LongestPathRootLeaf {
	
	class LongestPathData{
		int prevCount;
		List<Integer> path;
		public int getPrevCount() {
			return prevCount;
		}
		public void setPrevCount(int prevCount) {
			this.prevCount = prevCount;
		}
		public List<Integer> getPath() {
			return path;
		}
		public void setPath(List<Integer> path) {
			this.path = path;
		}
		
	}
	
	LongestPathData data = new LongestPathData();
	int prevCount;
	
	public void findLongestPath(NTreeNode root,int count,List<Integer> path) {
			if(root == null) {
				return;
			}
		
			System.out.println(root.getKey()+"====="+count);
			
			for(NTreeNode child : root.getChildren()) {
				List<Integer> newpath = null;
				count = count + 1;
				newpath = new ArrayList<Integer>(path);
				newpath.add(child.getKey());
				findLongestPath(child,count,newpath);
			}
			System.out.println(count+"==="+prevCount+"==="+path);
			if(count > data.getPrevCount()) {
				data.setPrevCount(count);
				data.setPath(path);
			}
	}
	
	public static void main(String args[]) {
		BuildBSTandNTree treeop = new BuildBSTandNTree();
		NTreeNode rootNode = treeop.buildNTree();
		
		LongestPathRootLeaf lp = new LongestPathRootLeaf();
		List<Integer> newlist = new ArrayList<Integer>();
		newlist.add(10);
		lp.findLongestPath(rootNode,0,newlist);
		System.out.println(lp.data.getPrevCount());
		for(Integer list : lp.data.getPath())
		{
			System.out.print(list+",");
			
		}
	}

}
