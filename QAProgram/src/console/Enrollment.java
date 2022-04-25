package console;

public class Enrollment {
	public void enroll() {
		Student myStudent = new Student("458-M2", "Matthew", "Mark", 22, Gender.Male);
		Student myStudent1 = new Student("459-M1", "Luke", "John", 29, Gender.Male);
		System.out.println(myStudent);
		System.out.println(myStudent1);
	}
}
