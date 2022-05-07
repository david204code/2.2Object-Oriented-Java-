package console;

//Trainer class
public class Trainer extends User {
	
	private String trainerID;
	private double salary;
	private boolean dbsClear;
	
	//Trainer constructor
	public Trainer(String trainerID, double salary, boolean dbsClear, String firstName, String lastName, int age, Gender gender) {
		//super() to invoke User constructor
		super(firstName, lastName, age, gender);
		this.trainerID = trainerID;
		this.salary = salary;
		this.dbsClear = dbsClear;
	}
	
	public String getTrainerID() {
		return trainerID;
	}
	
	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean getDbsClear() {
		return dbsClear;
	}
	
	public void setDbsClear(boolean dbsClear) {
		this.dbsClear = dbsClear;
	}
	
	public String toString() {
		return String.format("TrainerID: %s, Salary: %s, DBSClear: %s, FirstName: %s, LastName: %s, Age: %s, Gender: %s", trainerID, salary, dbsClear, getFirstName(), getLastName(), getAge(), getGender());
	}
}
