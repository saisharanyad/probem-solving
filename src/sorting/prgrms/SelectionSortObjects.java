package sorting.prgrms;



public class SelectionSortObjects {
	
	public static Student[] selectionSortObjects(Student[] arr,int n){
		
		for(int i=0;i<n-1;i++) {
			Student minStudent = arr[i];
			int minIndex = i;
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[j].getId() <= minStudent.getId()) {
					minStudent = arr[j];
					minIndex = j;
				}
			}
			
			arr[minIndex] = arr[i];
			arr[i] = minStudent;
		}
		
		return arr;
		
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
		
		
		System.out.println("before sort");
		for(Student stud : students) {
			System.out.print(stud.getId()+"--"+stud.getName());
		}
		
		students = selectionSortObjects(students,students.length);
		
		System.out.println("after sort");
		
		for(Student stud : students) {
			System.out.print(stud.getId()+"--"+stud.getName());
		}
		
		
	}


}
