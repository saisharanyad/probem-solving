package trees.programs;

import java.util.ArrayList;
import java.util.List;

public class LongestPathRootLeafOptimal {
	
	
	class LongestPathData{
		int height;
		int path;
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getPath() {
			return path;
		}
		public void setPath(int path) {
			this.path = path;
		}
		
	}
	
	
	public int longestPath(NTreeNode root,int level,List<LongestPathData> levelMaxArray) {
		if(root == null) return 0;
		
		int maxHt = -1;
		
		for(NTreeNode child : root.getChildren()) {
			maxHt = Math.max(maxHt,longestPath(child,level+1,levelMaxArray));
		}
		
		
		System.out.println("before while level::: "+level+"==key"+root.getKey());
		while(levelMaxArray.size() <= level) {
			System.out.println("in while"+level);
			LongestPathData data = new LongestPathData();
			data.setHeight(-1);
			data.setPath(Integer.MIN_VALUE);
			levelMaxArray.add(data);
		}
		System.out.println("data in levelmaxarray after while");
		for(LongestPathData data : levelMaxArray) {
			System.out.println(data.getPath()+","+data.getHeight());
		}
		
		int existingHt = levelMaxArray.get(level).getHeight();
		System.out.println("existing ht "+existingHt+" ==maxHt== "+maxHt); 
		if(existingHt <= maxHt) {
			LongestPathData data = levelMaxArray.get(level);
			data.setHeight(maxHt+1);
			data.setPath(root.getKey());
			levelMaxArray.set(level,data);
		}
		
		System.out.println("final data in levelmaxarray"+" == returned ht"+(maxHt+1));
		for(LongestPathData data : levelMaxArray) {
			System.out.println(data.getPath()+","+data.getHeight());
		}
		
		return maxHt+1;
	}
	
	
	public static void main(String args[]) {
		BuildBSTandNTree treeop = new BuildBSTandNTree();
		NTreeNode rootNode = treeop.buildNTree();
		
		LongestPathRootLeafOptimal lp = new LongestPathRootLeafOptimal();
		List<LongestPathData> newlist = new ArrayList<LongestPathData>();
		int count = lp.longestPath(rootNode,0,newlist);
		System.out.println(count);
		for(LongestPathData lpd : newlist) {
			System.out.print(lpd.getPath()+" ");
		}
		
	}

}
