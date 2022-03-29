package upgrad.oop;

public class Student {
	
	 private String name;
	 private String admNo;
	 private String  grade;
	 
	
	
	 public Student(String name,String admNo,String grade){
		 this.name = name;
		 this.admNo = admNo;
		 this.grade = grade;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmNo() {
		return admNo;
	}

	public void setAdmNo(String admNo) {
		this.admNo = admNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	 
	 
}
