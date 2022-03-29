package sorting.prgrms;

public class InsertionSortObjects {
	
public static void insertionSortObject(Student[] arr,int n) {
		
		for(int i = 1;i<n;i++) {
			Student right = arr[i];
			int leftIndex = i-1;
			
			while(leftIndex >= 0 && arr[leftIndex].getId() > right.getId()) {
				arr[leftIndex + 1] = arr[leftIndex];
				leftIndex = leftIndex - 1;
			}
			
			arr[leftIndex+1] = right;
			
		}
	}

public static void main(String args[]) {
	Student s1 = new Student();
	s1.setId(2);
	s1.setName("sana");
	
	Student s2 = new Student();
	s2.setId(3);
	s2.setName("farah");
	
	Student s3 = new Student();
	s3.setId(8);
	s3.setName("abc");
	
	Student s4 = new Student();
	s4.setId(2);
	s4.setName("julia");
	
	Student s5 = new Student();
	s5.setId(1);
	s5.setName("noorah");
	
	Student s6 = new Student();
	s6.setId(5);
	s6.setName("fetih");
	
	Student[] students = {s1,s2,s3,s4,s5,s6};
	
	for(Student element : students) {
		System.out.print(element.getId()+"--"+element.getName()+";");
	}
	
	System.out.println("\n");
	insertionSortObject(students,students.length);
	
	
	for(Student element : students) {
		System.out.print(element.getId()+"--"+element.getName()+";");
	}
	
}

}
