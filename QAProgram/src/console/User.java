package console;

//User class
public class User {
	
	private String firstName, lastName;
	private int age;
	private Gender gender;
	
	//User constructor 
	public User(String firstName, String lastName, int age, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
//		printGender();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}	
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
//	public final void printGender() {
//		System.out.println(gender.name());
////		gender.name();
//	}

}

