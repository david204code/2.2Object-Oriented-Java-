package console;

public class Course {
	
	private String courseName;
	private String courseDuration;
	private String courseSchedule;
	
	public Course(String courseName, String courseDuration, String courseSchedule) {
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseSchedule = courseSchedule;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseDuration() {
		return courseDuration;
	}
	
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	public String getCourseSchedule() {
		return courseSchedule;
	}
	
	public void setCourseSchedule(String courseSchedule) {
		this.courseSchedule = courseSchedule;
	}
}
