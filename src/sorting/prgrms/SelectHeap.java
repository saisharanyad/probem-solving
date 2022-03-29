package sorting.prgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import sorting.prgrms.SelectHeap.HeapNode;

/*
 * Given List<List<Integers>> sort all the elements in ascending or descending order.
 * Select Heap only works for Sorted list items
 */
public class SelectHeap {
	
	class HeapNode implements Comparable<HeapNode>{
		int val;
		int listIndex;
		int elementIndex;
		
		HeapNode(int val,int listIndex,int elementIndex){
			this.val = val;
			this.listIndex = listIndex;
			this.elementIndex = elementIndex;
		}

		@Override
		public int compareTo(HeapNode node) {
			
			return node.val > this.val ? -1 : 1;
			//return Integer.compare(val,node.val);
		}
	}
	
	
	
	public void selectHeap(List<List<Integer>> itemList) {
		
		int m = itemList.size();
		Queue<HeapNode> heapItems = new PriorityQueue<HeapNode>();
		//space of heap = O(m)
		for(int i=0;i<m;i++) {
			heapItems.offer(new HeapNode(itemList.get(i).get(0),i,0));
		}
		
		//TC: Build Heap = O(mn) +  Delete Min = mnlogm
		while(!heapItems.isEmpty()) {
			HeapNode heapNode = heapItems.poll();
			System.out.println(heapNode.val);
			int listIndex = heapNode.listIndex;
			int elementIndex = heapNode.elementIndex;
		
			if(elementIndex < itemList.get(listIndex).size()-1)
			{
			heapItems.offer(new 
					HeapNode(itemList.get(listIndex).get(elementIndex + 1),
							listIndex,
							elementIndex+1));
			}
		
		}
	}
	
	public static void main(String args[]) {
		SelectHeap selectHeap = new SelectHeap();
		
		List<List<Integer>> itemList = new ArrayList<List<Integer>>();
		
		//asc
		List<Integer> list1 = Arrays.asList(1,3,5);
		List<Integer> list2 = Arrays.asList(1,1,2,7);
		List<Integer> list3 = Arrays.asList(4,6);
		List<Integer> list4 = Arrays.asList(7,11,13,24,25);
		
		//desc
		/**List<Integer> list1 = Arrays.asList(5,3,3,1);
		List<Integer> list2 = Arrays.asList(7,2,1,1);
		List<Integer> list3 = Arrays.asList(6,4,4,2);
		List<Integer> list4 = Arrays.asList(25,13,11,7);**/
		
		/**List<Integer> list1 = Arrays.asList(1,5,3);
		List<Integer> list2 = Arrays.asList(7,1,2,1);
		List<Integer> list3 = Arrays.asList(4,6);
		List<Integer> list4 = Arrays.asList(25,11,13,24,7);**/
		
		itemList.add(list1);
		itemList.add(list2);
		itemList.add(list3);
		itemList.add(list4);
		
		selectHeap.selectHeap(itemList);
	}

}
