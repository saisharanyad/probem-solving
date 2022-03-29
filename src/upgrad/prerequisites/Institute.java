package upgrad.prerequisites;

import java.util.ArrayList;
import java.util.List;

public class Institute {
	  private final String name;
	  private final List<Student> students = new ArrayList<Student>();
	  public int numberOfStudents = 1;

	  public Institute(String name) {
	    // complete this constructor
	    // Instruction:
	    // Set the instance variable name to the parameter variable name
	    this.name = name;
	  }

	  public void addStudent(Student s) {
	    // complete this method here
	    // Instruction:
	    // add student s to the instance variable: ArrayList<Student> students
	    students.add(s);
	  }

	  public void addStudent(Student[] array) {
	    // complete this method here
	    // instruction:
	    // add all the students in the Student[] array to
	    // the instance variable: ArrayList<Student> students
		  for(Student s: array){
			  students.add(s);
		  }
	  }

	  public String toString() {
	    // complete this method
	    // Instruction:
	    // 1. Loop through all the students stored in the instance variable: ArrayList<Student> students and return a String that contains the each name and roll number of each student
	    // 2. An example String to be returned should look like:
	    /*   "Christ Academy: Vigyan 1, Vedanshi 2, Jahnvi 3, Abhiraj 4, " // notice the extra comma and space at the end*/
		  String studentDetails = this.name+": ";
		  String studentNames = "";
		  for(Student s : students){
			  studentNames = studentNames+s.toString()+", ";
		  }
		  return studentDetails+""+studentNames;
		  
	  }
}
