package upgrad.prerequisites;

public class Student {
	  private final String name;
	  private final int rollNumber;
	  private final Institute institute;

	  public Student(String n, Institute institute) {
	    this.name = n;
	    this.institute = institute;
	    this.rollNumber = this.institute.numberOfStudents++;
	  }

	  public String toString() {
	    return this.name + " " + this.rollNumber;
	  }
}
