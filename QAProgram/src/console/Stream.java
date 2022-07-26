package console;

public class Stream extends Course{
	
	//Stream constructor
	public Stream(String courseName, String courseDuration, String courseSchedule) {
		//invoke the Course constructor
		super(courseName, courseDuration, courseSchedule);
	}
	
	public String toString() {
		return String.format("Course Name: %s, Course Duration: %s, Course Schedule: %s", getCourseName(), getCourseDuration(), getCourseSchedule());
	}
}
