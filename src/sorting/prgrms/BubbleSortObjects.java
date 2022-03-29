package sorting.prgrms;

public class BubbleSortObjects {
	
public static void bubbleSortObjects(Student[] arr,int n){
		
		for(int i = 0; i < n-1;i++) {
			
			for(int j = n-1; j > i;j--) {
				
				if(arr[j-1].getId() > arr[j].getId()) {
					Student tmp = arr[j];
					arr[j]  = arr[j-1];
					arr[j-1] = tmp;
				}
			}
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
		
		for(Student stud : students) {
			System.out.println(stud.getId()+"--"+stud.getName());
		}
		
		bubbleSortObjects(students,students.length);
		
		for(Student stud : students) {
			System.out.println(stud.getId()+"--"+stud.getName());
		}
	
	}

}
