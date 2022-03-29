package sorting.prgrms;

import java.util.ArrayList;
import java.util.List;

public class MergeSortObjects {
	
	
	static int index = 1;
	public static void mergeListofItems(List<Student> itemsList,int n) {
		
		int start = 0;
		int end = n-1;
		
		mergePartition(itemsList,start,end);
	}
	
	public static  void mergePartition(List<Student>
		itemsList,int start,int end) {
		
		if(start >= end) {
			return;
		}
		
		int mid = start + (end-start)/2;
		
		mergePartition(itemsList,start,mid);
		mergePartition(itemsList,mid+1,end);
		merge(itemsList,start,end,mid);
		
	}
	
	
	 public static void merge(List<Student>
	 		itemsList,int start,int end,int mid) {
		
		int length1 = mid-start + 1;
		int length2 = end-mid;
		
		List<Student> list1 = new ArrayList<Student>();
		List<Student> list2 = new ArrayList<Student>();
	
		
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
			
			if(list1.get(pointer1).name.compareTo(list2.get(pointer2).name) < 0) {
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
	 
	 class Student{
			int id;
			String name;
			String grade;
			
			Student(int id,String name,String grade){
				this.id = id;
				this.name = name;
				this.grade = grade;
			}
			
		}
	 
	 public static void main(String args[]) {
		 	MergeSortObjects mso = new MergeSortObjects();
			Student student1 =  mso.new Student(1,"abc","1A");
			Student student2 =  mso.new Student(4,"vc","1B");
			Student student3 =  mso.new Student(2,"z","1C");
			Student student4 =  mso.new Student(3,"erty","1A");
			
			List<Student> studlist = new ArrayList<Student>();
			studlist.add(student1);
			studlist.add(student2);
			studlist.add(student3);
			studlist.add(student4);
			
			mergeListofItems(studlist,4);
			
			for(Student student:studlist) {
				System.out.println(student.id+"== "+student.name+"== "+student.grade);
			}
	 }

}
