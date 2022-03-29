package recursion.pograms;

import java.util.ArrayList;
import java.util.List;

public class CombinationsFromMultipleLists {
	
	
	
	public static void main(String args[]) {
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		data1.add(2);
		data1.add(3);
		
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		data2.add(4);
		data2.add(6);
		
		ArrayList<Integer> data3 = new ArrayList<Integer>();
		data3.add(2);
		
		ArrayList<Integer> data4 = new ArrayList<Integer>();
		data4.add(1);
		data4.add(2);
		data4.add(3);
		
		List<ArrayList<Integer>> dataList = new ArrayList<ArrayList<Integer>>();
		dataList.add(data1);
		dataList.add(data2);
		dataList.add(data3);
		dataList.add(data4);
		
		String combiList = "";
		CombinationsFromMultipleLists ml = new CombinationsFromMultipleLists();
		ml.combinationOfLists(combiList,0,dataList);
		
	}


	private void combinationOfLists(String combList, int level, 
		List<ArrayList<Integer>> dataList) {
		
		if(level == dataList.size()) {
			System.out.println("combi list is::: "+combList);
			return;
		}
		
		
		for(int i = 0;i < dataList.get(level).size(); i++) {
			
			combinationOfLists(combList+dataList.get(level).get(i),level+1,dataList);
		}
		
	}

}
