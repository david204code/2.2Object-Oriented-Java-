package console;

//Student class
public class Student extends User {
	
	private String studentID;
	
	//Student constructor
	public Student(String studentID, String firstName, String lastName, int age, Gender gender) {
		//super() to invoke User constructor
		super(firstName, lastName, age, gender);
		this.studentID = studentID;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
}
