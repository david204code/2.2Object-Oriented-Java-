package console;
import java.util.*;

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
		
		ArrayList<Stream> myList = new ArrayList<Stream>();
		Stream s1 = new Stream("Java", "6 Months", "M-W-F");
		myList.add(s1);
		System.out.println(s1);
		
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
