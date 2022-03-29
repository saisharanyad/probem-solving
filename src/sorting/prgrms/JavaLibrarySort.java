package sorting.prgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class JavaLibrarySort {
	
	
	//Arrays.sort uses TimSort for Objects
	public static void timSort(List<Integer> list) {
	
		Object[] arr = list.toArray();
		Arrays.sort(arr);
		//System.out.println(arr[0] instanceof Integer);
		for(Object i : arr) {
			System.out.println(i);
		}
	}
	
	
	//Collections.sort uses merge sort = used with Objects as it is a stable algo
	public static void mergeSort(List<Integer> list) {
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	//ALL elements HeapSort in Java is implemented using PQ = default is MinHeap;
	//Collections.reverseOrder build MaxHeap
	public static void heapSort(List<Integer> list) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(Integer i : list) {
			pq.offer(i);
		}
		
		while(!pq.isEmpty())
		System.out.println(pq.peek());
		
		/**Iterator ite = pq.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}**/
		
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
	
	//compare  based on index of each listitem
	public static void comparator(List<ArrayList<Integer>> intlist,int index) {
		//1way
		Collections.sort(intlist,
				(list1,list2)->list1.get(index).compareTo(list2.get(index)));
		
		//2way
		intlist.stream().
		sorted(Comparator.comparing(list->list.get(index))).
		collect(Collectors.toList());
		
		System.out.println(intlist);
	}
	
	//compare custom objects based on properties
	public static void comparatorObject(List<Student> studlist) {
		Collections.sort(studlist,(stud1,stud2)->stud1.name.compareTo(stud2.name));
		//Collections.sort(studlist,(stud1,stud2)-> stud1.id - stud2.id);
		for(Student student:studlist) {
			System.out.println(student.id+"== "+student.name+"== "+student.grade);
		}
	}
	
		
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(67);
		list.add(2);
		list.add(23);
		list.add(23);
		
		//timSort(list);
		//mergeSort(list);
		heapSort(list);
		
		
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
		
		//comparator(intlist,1);
		
		JavaLibrarySort jls = new JavaLibrarySort();
		Student student1 =  jls.new Student(1,"abc","1A");
		Student student2 =  jls.new Student(2,"vc","1B");
		Student student3 =  jls.new Student(3,"z","1C");
		Student student4 =  jls.new Student(4,"erty","1A");
		
		List<Student> studlist = new ArrayList<Student>();
		studlist.add(student1);
		studlist.add(student2);
		studlist.add(student3);
		studlist.add(student4);
		//comparatorObject(studlist);
	}

}
