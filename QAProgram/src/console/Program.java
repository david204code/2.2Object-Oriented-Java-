package console;

public class Program {
	public static void main(String[] args) {
		
//		option 1
//		Student myStudent = new Student("458-M2", "Matthew", "Mark", 22, Gender.Male);
//		Student myStudent1 = new Student("459-M1", "Luke", "John", 29, Gender.Male);
//		System.out.println(myStudent);
//		System.out.println(myStudent1);
		
//		option 2
//		Enrollment();
		
//		option 3
		Enrollment students = new Enrollment();
		students.enroll();
		
		Employment trainers = new Employment();
		trainers.employ();
		
	}

//	option 2
//	private static void Enrollment() {
//		Student myStudent = new Student("458-M2", "Matthew", "Mark", 22, Gender.Male);
//		Student myStudent1 = new Student("459-M1", "Luke", "John", 29, Gender.Male);
//		System.out.println(myStudent);
//		System.out.println(myStudent1);
//		
//	}
}
