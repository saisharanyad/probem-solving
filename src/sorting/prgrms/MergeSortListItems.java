package sorting.prgrms;

import java.util.ArrayList;
import java.util.List;

public class MergeSortListItems {
	
	static int index = 1;
	public static void mergeListofItems(List<ArrayList<Integer>> itemsList,int n) {
		
		int start = 0;
		int end = n-1;
		
		
		mergePartition(itemsList,start,end);
		
	}
	
	public static  void mergePartition(List<ArrayList<Integer>>
		itemsList,int start,int end) {
		
		if(start >= end) {
			return;
		}
		
		int mid = start + (end-start)/2;
		
		mergePartition(itemsList,start,mid);
		mergePartition(itemsList,mid+1,end);
		merge(itemsList,start,end,mid);
		
	}
	
	
	 public static void merge(List<ArrayList<Integer>>
	 		itemsList,int start,int end,int mid) {
		
		int length1 = mid-start + 1;
		int length2 = end-mid;
		
		List<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		List<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
	
		
		for(int i=start;i<=mid;i++) {
			list1.add(itemsList.get(i));
		}
		
		for(int j=mid+1;j<=end;j++) {
			list2.add(itemsList.get(j));
		}
		
		int pointer1=0;
		int pointer2 =0;
		int pointer3=start;
		while(pointer1 < length1 && pointer2 < length2) {
			/**if(list1.get(pointer1) < list2.get(pointer2)) {
				itemsList.set(pointer3,list1.get(pointer1));
				pointer1 = pointer1 + 1;
				
			}else {
				itemsList.set(pointer3,list2.get(pointer2));
				pointer2 = pointer2 + 1;
			}**/
			
			if(list1.get(pointer1).get(index) < list2.get(pointer2).get(index)) {
			itemsList.set(pointer3,list1.get(pointer1));
			pointer1 = pointer1 + 1;
			
			}else {
			itemsList.set(pointer3,list2.get(pointer2));
			pointer2 = pointer2 + 1;
			}
			
			pointer3 = pointer3 + 1;
		}
		
		while(pointer1 < length1) {
			itemsList.set(pointer3,list1.get(pointer1));
			pointer1 = pointer1 + 1;
			pointer3 = pointer3 + 1;
		}
		
		
		while(pointer2 < length2) {
			itemsList.set(pointer3,list2.get(pointer2));
			pointer2 = pointer2 + 1;
			pointer3 = pointer3 + 1;
		}
		
		
		
	}
	
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(17);
		list.add(5);
		list.add(6);
		list.add(2);
		
		System.out.println("before partition======");
		System.out.println(list);
		//mergeListofItems(list,4);
		
		System.out.println("after parition=====");
		System.out.println(list);
		
		
		List<ArrayList<Integer>> intlist = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> listnum1 = new ArrayList<>();
		listnum1.add(4);
		listnum1.add(197);
		listnum1.add(9);
		
		ArrayList<Integer> listnum2 = new ArrayList<>();
		listnum2.add(14);
		listnum2.add(70);
		listnum2.add(19);
		
		
		ArrayList<Integer> listnum3 = new ArrayList<>();
		listnum3.add(20);
		listnum3.add(90);
		listnum3.add(59);
		
		intlist.add(listnum1);
		intlist.add(listnum2);
		intlist.add(listnum3);
		
		mergeListofItems(intlist,3);
		System.out.println(intlist);
	}

}
